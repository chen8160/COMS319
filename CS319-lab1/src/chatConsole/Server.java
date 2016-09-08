package chatConsole;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.io.*;

public class Server implements Runnable {

	private ArrayList<Socket> clientList;
	private ServerSocket serverSocket;
	private Thread mainThread;
	private Socket adminSocket = null;
	private File file = new File("chat.txt");

	public Server() {

		clientList = new ArrayList<Socket>();
		try {
			System.out.println("Binding to port " + 1222 + ", please wait  ...");
			serverSocket = new ServerSocket(1222);
			System.out.println("Server started: " + serverSocket);
			start();
		} catch (IOException ioe) {
			System.out.println("Can not bind to port " + 1222 + ": " + ioe.getMessage());
		}

	}

	@Override
	public void run() {
		Socket clientSocket = null;
		while (true) {
			try {
				clientSocket = serverSocket.accept();
				addThread(clientSocket);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	}

	private void addThread(Socket socket) throws IOException {

		clientList.add(socket);
		Scanner in = new Scanner(new DataInputStream(socket.getInputStream()));

		Thread t = new Thread() {
			@Override
			public void run() {

				while (!in.hasNext())
					;
				String username = strEncryption(in.next());
//				System.out.println(username);
				if (username.equals("admin")) {
					adminSocket = socket;
					System.out.println("Admin connected!");
				} else {
					System.out.println(username + " connected!");
				}
				while (true) {
					if (in.hasNextLine()) {
						String command = strEncryption(in.nextLine());
						// Commands: 1. send msg //2. send image //3. list msg //4. delete msg.
						if (command.equals("1")) {
							while (!in.hasNextLine())
								;
							String msg = strEncryption(in.nextLine());
//							System.out.println(msg);
							for (Socket s : clientList) {
								if(s.equals(socket))
									continue;
								PrintWriter out;
								try {
									out = new PrintWriter(new DataOutputStream(s.getOutputStream()));
									out.println(msg);
									out.flush();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		};
		t.start();
	}
	
	private String strEncryption(String original){
		char[] strArray = original.toCharArray();
		for(int i = 0; i < strArray.length; i++){
			strArray[i] ^= 0b11110000;
		}
		String ret = String.valueOf(strArray);
		return ret;
	}

	private void start() {
		// TODO Auto-generated method stub
		mainThread = new Thread(this);
		mainThread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Server s = new Server();
	}

}

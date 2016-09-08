package chatConsole;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client implements Runnable {

	private String username;
	private Socket serverSocket;
	private DataOutputStream streamOut = null;
	private Thread clientThread = null;
	private Scanner in = new Scanner(System.in);

	public Client() {
		this.username = login();
		try {
			serverSocket = new Socket("localhost", 1222);
			this.streamOut = new DataOutputStream(serverSocket.getOutputStream());
			start();
		} catch (UnknownHostException h) {
			System.out.println("Unknown Host " + h.getMessage());
			System.exit(1);
		} catch (IOException e) {
			System.out.println("IO exception: " + e.getMessage());
			System.exit(1);
		}
	}

	@Override
	public void run() {

//		System.out.println(strEncryption(username));
		handleChat(strEncryption(username));

		while (true) {
			// if(!in.hasNext())
			// continue;
			if (username.equals("admin")) {
				System.out.printf(
						"1. Broadcast message to all clients\n2. List messages so far (from chat.txt)\n3. Delete a selected message (from chat.txt) - give a message number.\n");
				Scanner lineScanner = new Scanner(in.nextLine());
				int option = lineScanner.nextInt();
				if (option == 1) {
					// TODO
					handleChat(strEncryption("1"));
					while(!in.hasNextLine());
					String msg = strEncryption(in.nextLine());
					handleChat(msg);
				} else if (option == 2) {
					// TODO
				} else if (option == 3) {
					// TODO
				} else {
					System.out.println("No such option!!");
					in.close();
					System.exit(1);
				}
				lineScanner.close();
			} else {
				System.out.printf("1. Send a text message to the server\n2. Send an image file to the server\n");
				Scanner lineScanner = new Scanner(in.nextLine());
				int option = lineScanner.nextInt();
				if (option == 1) {
					// TODO
					handleChat(strEncryption("1"));
					while(!in.hasNextLine());
					String msg = strEncryption(in.nextLine());
					handleChat(msg);
				} else if (option == 2) {
					// TODO
				} else {
					System.out.println("No such option!!");
					in.close();
					System.exit(1);
				}
				lineScanner.close();
			}
		}
	}

	public String login() {
		System.out.print("What is your username? ");
		String un = in.nextLine();

		// if (un.equals("admin")) {
		// System.out.printf(
		// "1. Broadcast message to all clients\n2. List messages so far (from
		// chat.txt)\n3. Delete a selected message (from chat.txt) - give a
		// message number.\n");
		// } else {
		// System.out.printf("1. Send a text message to the server\n2. Send an
		// image file to the server\n");
		// }
		return un;
	}

	public void start() {
		// TODO
		clientThread = new Thread(this);
		clientThread.start();

		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					Scanner in;
					try {
						in = new Scanner(new DataInputStream(serverSocket.getInputStream()));
						while (in.hasNextLine()) {
							String msg = strEncryption(in.nextLine());
							System.out.println(msg);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}

	public synchronized void handleChat(String msg) {
		// TODO
		PrintWriter out = new PrintWriter(streamOut);
		out.println(msg);
		out.flush();
	}
	
	private String strEncryption(String original){
//		char[] strArray = original.toCharArray();
//		for(int i = 0; i < strArray.length; i++){
//			strArray[i] ^= 0b11110000;
//		}
//		String ret = String.valueOf(strArray);
//		return ret;
		char key = 0b11110000;
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < original.length(); i++)
		    sb.append((char) (original.charAt(i) ^ key));

		return sb.toString();

	}

	public static void main(String[] args) {

		Client c = new Client();

	}

}

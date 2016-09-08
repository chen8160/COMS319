package chatApp;//package lab3;

import java.net.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.io.*;

public class Server implements Runnable
{
	
	private ServerSocket serverSocket = null;
	private Thread mainThread = null;
	private File file = new File("chat.txt");
	private PrintWriter writer;
	private ServerGUI frame;
	private Thread guiMessageThread;
	private ArrayList<Socket> clientList;

	public Server(int port)
	{
		//TODO Binding and starting server
		clientList = new ArrayList<Socket>();
		try
		{
			System.out.println("Binding to port " + port + ", please wait  ...");
			serverSocket = new ServerSocket(port);
			System.out.println("Server started: " + serverSocket);
			start();
		} catch (IOException ioe)
		{
			System.out.println("Can not bind to port " + port + ": " + ioe.getMessage());
		}
	}

	public void run()
	{
		//TODO wait for a client or show error
		while(true){
			Socket clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
				addThread(clientSocket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void start()
	{
		frame = new ServerGUI();
		frame.setVisible(true);
		//TODO launch a thread to read for new messages by the server
		mainThread = new Thread(this);
		mainThread.start();
		guiMessageThread = new Thread(){
			@Override
			public void run(){
				while(true){
					String msg = frame.getMessage();
					handle(msg);
				}
			}
		};
		guiMessageThread.start();
	}
	
	public void stop()
	{
		//TODO
		
	}

	private int findClient(int ID)
	{
		//TODO Find Client
		

		return -1;
	}

	public synchronized void handle(String input)
	{
		// TODO new message, send to clients and then write it to history
		for(Socket s: clientList){
			PrintWriter out;
			try {
				out = new PrintWriter(new DataOutputStream(s.getOutputStream()));
				out.print(input + '\n');
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//TODO update own gui
		frame.recieveMessage(input + '\n');
	}

	public synchronized void remove(int ID)
	{
		//TODO get the serverthread, remove it from the array and then terminate it
		
	}

	private void addThread(Socket socket)
	{
		//TODO add new client
		clientList.add(socket);
		Thread t = new Thread(){
			
			@Override
			public void run(){
				Scanner in;
				try {
					in = new Scanner(new DataInputStream(socket.getInputStream()));
					while(in.hasNextLine()){
						String msg = in.nextLine();
//						handle(msg);
						frame.recieveMessage(msg + '\n');
						for(Socket s: clientList){
							if(!s.equals(socket)){
								PrintWriter out;
								out = new PrintWriter(new DataOutputStream(s.getOutputStream()));
								out.print(msg + '\n');
								out.flush();
							}
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		t.start();
	}

	public static void main(String args[])
	{
		Server server = null;
		server = new Server(1222);
	}
}
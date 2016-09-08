package chatConsole;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Server implements Runnable{

	private ArrayList<Socket> clientList;
	private ServerSocket serverSocket;
	private Thread mainThread;
	
	public Server(){
		
		clientList = new ArrayList<Socket>();
		try
		{
			System.out.println("Binding to port " + 1222 + ", please wait  ...");
			serverSocket = new ServerSocket(1222);
			System.out.println("Server started: " + serverSocket);
			start();
		} catch (IOException ioe)
		{
			System.out.println("Can not bind to port " + 1222 + ": " + ioe.getMessage());
		}
		
	}
	
	@Override
	public void run() {
		while(true){
			Socket clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
				addThread(clientSocket);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void addThread(Socket socket){
		
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

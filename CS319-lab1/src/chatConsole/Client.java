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
		while (true) {
//			if(!in.hasNext())
//				continue;
			if (username.equals("admin")) {
				System.out.printf("1. Broadcast message to all clients\n2. List messages so far (from chat.txt)\n3. Delete a selected message (from chat.txt) - give a message number.\n");
				int option = in.nextInt();
				if (option == 1) {
					// TODO
				} else if (option == 2) {
					// TODO
				} else if (option == 3) {
					// TODO
				} else {
					System.out.println("No such option!!");
					in.close();
					System.exit(1);
				}
			} else {
				System.out.printf("1. Send a text message to the server\n2. Send an image file to the server\n");
				int option = in.nextInt();
				if (option == 1) {
					// TODO
				} else if (option == 2) {
					// TODO
				} else {
					System.out.println("No such option!!");
					in.close();
					System.exit(1);
				}
			}
		}
	}

	public String login() {
		System.out.print("What is your username? ");
		String un = in.next();

//		if (un.equals("admin")) {
//			System.out.printf(
//					"1. Broadcast message to all clients\n2. List messages so far (from chat.txt)\n3. Delete a selected message (from chat.txt) - give a message number.\n");
//		} else {
//			System.out.printf("1. Send a text message to the server\n2. Send an image file to the server\n");
//		}
		return un;
	}

	public void start() {
		// TODO
		clientThread = new Thread(this);
		clientThread.start();
	}

	public static void main(String[] args) {

		Client c = new Client();

	}

}

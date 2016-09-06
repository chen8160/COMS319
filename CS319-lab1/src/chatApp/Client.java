package chatApp;

import java.net.*;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.io.*;

public class Client implements Runnable
{
	private Socket socket = null;
	private Thread thread = null;
	private DataOutputStream streamOut = null;
	//private ClientThread client = null;
	private String username;
	private ChatGUI frame;

	public Client(String ipAddr, String username, int serverPort)
	{
		this.username = username;
		// set up the socket to connect to the gui
		try
		{
			socket = new Socket(ipAddr, serverPort);
			this.streamOut = new DataOutputStream(socket.getOutputStream());
			start();
		} catch (UnknownHostException h)
		{
			JOptionPane.showMessageDialog(new JFrame(), "Unknown Host " + h.getMessage());
			System.exit(1);
		} catch (IOException e)
		{
			JOptionPane.showMessageDialog(new JFrame(), "IO exception: " + e.getMessage());
			System.exit(1);
		}
	}

	public void run()
	{
		//TODO check for a new message, once we receive it, steamOut will send it to the server
		
		while(true){
			String msg = frame.getMessage();
			if(msg != null){
				handleChat(msg);
			}
		}
	}

	public synchronized void handleChat(String msg)
	{
		//TODO
		PrintWriter out = new PrintWriter(streamOut);
		frame.recieveMessage(msg + '\n');
		out.print(msg + '\n');
		out.flush();
	}

	public void start() throws IOException
	{
		frame = new ChatGUI(username);
		frame.setVisible(true);
		//TODO 
		Thread t1 = new Thread(this);
		t1.start();
		
		Thread t2 = new Thread(){
			@Override
			public void run(){
				while(true){
				Scanner in;
				try {
					in = new Scanner(new DataInputStream(socket.getInputStream()));
					while(in.hasNextLine()){
						String msg = in.nextLine();
						frame.recieveMessage(msg + '\n');
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

	public void stop()
	{
		//TODO
	
	}

	
}

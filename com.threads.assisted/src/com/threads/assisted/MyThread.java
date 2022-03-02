package com.threads.assisted;


	public class MyThread extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		MyThread thread = new  MyThread();
	  		thread.start();
	 	}
	}


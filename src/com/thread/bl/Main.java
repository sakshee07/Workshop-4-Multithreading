package com.thread.bl;

public class Main {

	public static void main(String[] args) {
		
		CharacterThread characterThread = new CharacterThread();
		NumberRunnable numberRunnable = new NumberRunnable();
		Thread numberThread = new Thread(numberRunnable);
	//	numberThread.setDaemon(true);
		
		characterThread.start();
		//characterThread.setPriority(1);
		numberThread.start();
		//numberThread.interrupt();
		//numberThread.setPriority(5);
		System.out.println("Good bye from main");
	}
}

package com.thread.bl;

public class NumberRunnable implements Runnable{

	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (CharacterThread.thread == true)
			break;
			}	
		System.out.println("Good bye from numberThread");
	}
}

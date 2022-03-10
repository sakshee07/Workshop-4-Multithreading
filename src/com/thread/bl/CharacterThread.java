package com.thread.bl;

public class CharacterThread extends Thread  {
	
	public static boolean thread;
	@Override
	public void run() {
		for( char i ='A'; i <='Z'; i++) {
			System.out.println(i);
			
		}
		System.out.println("good bye from characterThread");
	}
	
}

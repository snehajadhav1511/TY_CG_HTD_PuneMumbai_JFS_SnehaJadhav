package com.capgemini.thread;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Pen p =  new Pen();
		p.start();
		
		try {
			p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Pen t= new Pen();
		t.start();
		
		System.out.println("Main Ended");
	}

}

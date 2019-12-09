package com.capgemini.thread;

public class Paytm extends Thread {
	
	PVR ref;

	public Paytm(PVR ref) {
		this.ref = ref;
	}
	
	@Override
	public void run() {
		ref.confirm();
	}
	
	
	

}

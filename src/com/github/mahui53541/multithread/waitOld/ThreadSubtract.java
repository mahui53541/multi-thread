package com.github.mahui53541.multithread.waitOld;

public class ThreadSubtract extends Thread {
	private Subtract r;
	public ThreadSubtract(Subtract r) {
		this.r=r;
	}
	
	@Override
	public void run() {
		r.substract();
	}
}

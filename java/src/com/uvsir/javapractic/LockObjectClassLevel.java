package com.uvsir.javapractic;

public class LockObjectClassLevel implements Runnable{
	public void run() {
		objectLock();
	}
	public void objectLock() {
		synchronized (LockObjectClassLevel.this) {
			System.out.println("Synchronized block " + Thread.currentThread().getName());
		}
	}
	public static void main(String []args) {
		LockObjectClassLevel obj = new LockObjectClassLevel();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
	}

}

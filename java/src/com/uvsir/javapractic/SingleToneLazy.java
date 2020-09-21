package com.uvsir.javapractic;

public class SingleToneLazy {
	
	private static SingleToneLazy inst ;
	
	private SingleToneLazy() {}
	
	public static  SingleToneLazy getInstance() {
		if(inst == null) {
			synchronized (SingleToneLazy.class) {
				if(inst == null) {
					inst = new SingleToneLazy();
				}
			}
			
		}
		return inst;
	}
}

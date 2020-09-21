package com.uvsir.javapractic;

public class SingleToneEager {
	
	private static  SingleToneEager ins ;
	
	private SingleToneEager() {
		
	}
	
	public static  SingleToneEager getInstance() {
		if(ins == null) {
			synchronized (SingleToneEager.class) {
				if(ins == null) {
					ins = new SingleToneEager();
				}
			}
		}
		return ins;
	}
	

}

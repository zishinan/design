package com.zj.design.singleton;

/**
 * 同步的实现方法，性能低下
 */
public class SynSingleton {
	private static SynSingleton instance;
	private SynSingleton(){
		
	}
	
	/**
	 * 方法上加synchronized
	 * @return
	 */
	public static synchronized SynSingleton getInstance(){
		if(instance == null){
			instance = new SynSingleton();
		}
		return instance;
	}
}

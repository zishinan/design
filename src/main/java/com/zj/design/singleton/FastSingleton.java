package com.zj.design.singleton;

/**
 * 快速实例化
 */
public class FastSingleton {
	/**
	 * 加载类时实例化
	 */
	private static FastSingleton instance = new FastSingleton();
	private FastSingleton(){
		
	}
	
	public static FastSingleton getInstance(){
		return instance;
	}
}

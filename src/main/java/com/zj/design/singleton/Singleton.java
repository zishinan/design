package com.zj.design.singleton;

/**
 * 最简单的实现方法，多线程环境下不能使用
 */
public class Singleton {
	private static Singleton instance;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(null == instance){
			instance = new Singleton();
		}
		return instance;
	}
}

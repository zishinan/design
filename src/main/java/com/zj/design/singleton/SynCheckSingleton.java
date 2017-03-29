package com.zj.design.singleton;

/**
 * 优化同步的实现方法
 */
public class SynCheckSingleton {
	/**
	 * 借助volatile关键字，1.5开始支持
	 * 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最的值。
	 */
	private volatile static SynCheckSingleton instance;
	private SynCheckSingleton(){
		
	}
	
	/**
	 * synchronized降级，在需要实例化才同步
	 * @return
	 */
	public static SynCheckSingleton getInstance(){
		if(null == instance){
			synchronized (SynCheckSingleton.class) {
				if(null == instance){
					instance = new SynCheckSingleton();
				}
			}
		}
		return instance;
	}
}

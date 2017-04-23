package com.zj.design.facade;

public class Client {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		Facade facade = new FacadeImpl(ca, cb);
		facade.facadeMethod();
	} 
}

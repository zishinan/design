package com.zj.design.facade;

public class FacadeImpl implements Facade {
	private ClassA ca;
	private ClassB cb;
	
	public FacadeImpl(ClassA ca, ClassB cb) {
		this.ca = ca;
		this.cb = cb;
	}

	@Override
	public void facadeMethod() {
		ca.doSomething();
		cb.doSomething();
	}
}

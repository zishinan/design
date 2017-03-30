package com.test.jz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.zj.design.singleton.FastSingleton;
import com.zj.design.singleton.Singleton;


public class TestSingleton{
	@Test
	public void testSingleton() throws Exception {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton == singleton2);
		Assert.assertEquals(singleton, singleton2);
	}
	
	@Test
	public void testIvokeSingleton() throws Exception {
		Singleton singleton = Singleton.getInstance();
		Class<Singleton> clazz = Singleton.class;
		Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
		// 一定要先将accessible设为true
		constructor.setAccessible(true);
		Singleton singleton2 = constructor.newInstance();
		System.out.println(singleton == singleton2);
	}
	
	@Test
	public void testIvokeFastSingleton() throws Exception {
		FastSingleton singleton = FastSingleton.getInstance();
		Class<FastSingleton> clazz = FastSingleton.class;
		Constructor<FastSingleton> constructor = clazz.getDeclaredConstructor();
		// 一定要先将accessible设为true
		constructor.setAccessible(true);
		FastSingleton singleton2 = constructor.newInstance();
		System.out.println(singleton == singleton2);
	}
}

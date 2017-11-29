package com.zjm.hello.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectService {

	
	public void sayHello(String name){
		System.out.println("Hello !" + name);
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Object object = Class.forName(ReflectService.class.getName()).newInstance();
		Method method = object.getClass().getMethod("sayHello", String.class);
		method.invoke(object, "zhangSan");
	}
}

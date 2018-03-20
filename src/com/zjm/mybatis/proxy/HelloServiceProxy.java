package com.zjm.mybatis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {
	
	//��ʵ����
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		return object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println(proxy.getClass().getName());
		System.err.println("##### #####����JDK��̬����#############");
		Object result = null;
		//���䷽���ĵ���ǰ
		System.err.println("��׼��˵Hello");
		result = method.invoke(target, args);
		Thread.sleep(1000);
		//���䷽���ĵ��ú�
		System.err.println("��˵��Hello��");
		return result;
	}

}

package com.zjm.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用构造工厂充当“注解解释器”
 * @author Administrator
 *
 */
public class UserFactory {
	public static User create() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		User user = new User();
		Method[] methods = User.class.getDeclaredMethods();
		for(Method method : methods){
			if(method.isAnnotationPresent(Init.class)){
				Init init = method.getAnnotation(Init.class);
				method.invoke(user, init.value());
			}
		}
		return user;
	}
}

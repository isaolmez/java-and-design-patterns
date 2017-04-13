package com.isa.patterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReadOnlyInvocationHandler implements InvocationHandler {

	private final User user;

	public ReadOnlyInvocationHandler(User user) {
		this.user = user;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
		if (method.getName().equals("read") || method.getName().equals("login")) {
			return method.invoke(user, args);
		} else {
			System.out.println("Not allowed");
			return null;
		}
	}
}

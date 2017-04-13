package com.isa.patterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class GenericInvocationHandler implements InvocationHandler {

	private final User user;

	private final Set<String> permittedOperations;

	public GenericInvocationHandler(User user, Set<String> permittedOperations) {
		this.user = user;
		this.permittedOperations = permittedOperations == null ? new HashSet<>() : new HashSet<>(permittedOperations);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (permittedOperations.contains(method.getName())) {
			return method.invoke(user, args);
		} else {
			System.out.println("Not allowed");
			return null;
		}
	}
}

package com.isa.patterns.proxy.securingdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicDataServiceProxy implements InvocationHandler {

    private final DataService dataService;
    private final User user;

    public DynamicDataServiceProxy(DataService dataService, User user) {
        this.dataService = dataService;
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Authorized authorized = method.getDeclaredAnnotation(Authorized.class);
        if (authorized != null) {
            String[] allowedRoles = authorized.allowed();
            if (isAllowed(allowedRoles)) {
                return method.invoke(dataService, args);
            } else {
                return null;
            }
        }

        return method.invoke(dataService, args);
    }

    private boolean isAllowed(String[] allowedRoles) {
        for (String allowedRole : allowedRoles) {
            if (user.getRoles().contains(allowedRole)) {
                return true;
            }
        }

        return false;
    }
}

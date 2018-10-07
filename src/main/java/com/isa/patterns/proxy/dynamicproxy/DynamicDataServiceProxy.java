package com.isa.patterns.proxy.dynamicproxy;

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
            String[] allowedPrivileges = authorized.allowed();
            if (isAllowed(allowedPrivileges)) {
                return method.invoke(dataService, args);
            } else {
                return null;
            }
        }

        return method.invoke(dataService, args);
    }

    private boolean isAllowed(String[] allowedPrivileges) {
        for (String allowedPrivilege : allowedPrivileges) {
            if (user.getPrivileges().contains(allowedPrivilege)) {
                return true;
            }
        }

        return false;
    }
}

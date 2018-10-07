package com.isa.patterns.proxy.dynamicproxy;

import com.google.common.collect.Lists;
import java.lang.reflect.Proxy;

public class ClientMain {

    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();
        System.out.println("Read-only user...");
        User readOnlyUser = new User();
        readOnlyUser.setPrivileges(Lists.newArrayList("read"));
        DataService dataServiceProxy = getDynamicProxy(dataService, readOnlyUser);
        dataServiceProxy.read();
        dataServiceProxy.update();
        dataServiceProxy.delete();

        System.out.println("Admin user...");
        User adminUser = new User();
        adminUser.setPrivileges(Lists.newArrayList("read", "update", "delete"));
        dataServiceProxy = getDynamicProxy(dataService, adminUser);
        dataServiceProxy.read();
        dataServiceProxy.update();
        dataServiceProxy.delete();
    }

    private static DataService getDynamicProxy(DataService dataService, User user) {
        return (DataService)
                Proxy.newProxyInstance(
                        dataService.getClass().getClassLoader(),
                        dataService.getClass().getInterfaces(),
                        new DynamicDataServiceProxy(dataService, user));
    }
}

package com.isa.patterns.proxy.securing;

public class ClientMain {

    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();
        System.out.println("Read-only user...");
        User readOnlyUser = new User();
        readOnlyUser.setCanRead(true);
        SecuringDataServiceProxy dataServiceProxy = new SecuringDataServiceProxy(dataService, readOnlyUser);
        dataServiceProxy.read();
        dataServiceProxy.update();
        dataServiceProxy.delete();

        System.out.println("Admin user...");
        User adminUser = new User();
        adminUser.setCanRead(true);
        adminUser.setCanUpdate(true);
        adminUser.setCanDelete(true);
        dataServiceProxy = new SecuringDataServiceProxy(dataService, adminUser);
        dataServiceProxy.read();
        dataServiceProxy.update();
        dataServiceProxy.delete();
    }
}

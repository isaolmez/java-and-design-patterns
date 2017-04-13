package com.isa.patterns.proxy.caching;

import com.isa.patterns.proxy.delaying.DelayingServiceProxy;
import com.isa.patterns.proxy.delaying.ExpensiveService;

public class ClientMain {
    public static void main(String[] args) {
        Service cachingProxy = new CachingServiceProxy(new ServiceImpl());
        cachingProxy.getUsers("us");
        cachingProxy.getUsers("us");
        cachingProxy.getUsers("us");
        cachingProxy.getUsers("us");
        System.out.println("Access count: " + cachingProxy.getAccessCount());
    }
}

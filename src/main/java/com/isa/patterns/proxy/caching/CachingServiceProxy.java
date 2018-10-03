package com.isa.patterns.proxy.caching;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CachingServiceProxy implements Service {

    private final Service service;

    private volatile ConcurrentMap<String, List<String>> cache;

    private Object writeLock = new Object();

    public CachingServiceProxy(Service service) {
        this.service = service;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override
    public List<String> getUsers(String country) {
        if (!cache.containsKey(country)) {
            synchronized (writeLock) {
                if (!cache.containsKey(country)) {
                    List<String> users = service.getUsers(country);
                    cache.put(country, users);
                }
            }
        }

        return cache.get(country);
    }

    @Override
    public int getAccessCount() {
        return service.getAccessCount();
    }
}

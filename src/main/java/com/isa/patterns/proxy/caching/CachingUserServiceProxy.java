package com.isa.patterns.proxy.caching;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CachingUserServiceProxy implements UserService {

    private final UserService userService;

    private final ConcurrentMap<String, List<String>> cache;

    private final Object writeLock = new Object();

    public CachingUserServiceProxy(UserService userService) {
        this.userService = userService;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override
    public List<String> getUsers(String country) {
        if (!cache.containsKey(country)) {
            synchronized (writeLock) {
                if (!cache.containsKey(country)) {
                    List<String> users = userService.getUsers(country);
                    cache.put(country, users);
                }
            }
        }

        return cache.get(country);
    }

    @Override
    public int getAccessCount() {
        return userService.getAccessCount();
    }
}

package com.isa.patterns.proxy.caching;

import java.util.List;

public interface Service {

    List<String> getUsers(String country);

    int getAccessCount();
}

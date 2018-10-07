package com.isa.patterns.proxy.dynamicproxy;

public interface DataService {

    @Authorized(allowed = "read")
    void read();

    @Authorized(allowed = "update")
    void update();

    @Authorized(allowed = "delete")
    void delete();
}

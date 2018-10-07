package com.isa.patterns.proxy.securingdynamic;

public interface DataService {

    @Authorized(allowed = "read")
    void read();

    @Authorized(allowed = "update")
    void update();

    @Authorized(allowed = "delete")
    void delete();
}

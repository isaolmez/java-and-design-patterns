package com.isa.patterns.proxy.dynamicproxy;

import java.util.List;

public class User {

    private List<String> privileges;

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }
}

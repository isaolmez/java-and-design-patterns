package com.isa.patterns.proxy.dynamicproxy;

import java.util.List;

public class User {

    private List<String> roles;

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}

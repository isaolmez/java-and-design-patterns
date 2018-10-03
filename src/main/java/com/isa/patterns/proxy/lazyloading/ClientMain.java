package com.isa.patterns.proxy.lazyloading;

public class ClientMain {

    public static void main(String[] args) {
        ExpensiveService delayingProxy = new LazyLoadingServiceProxy();
        delayingProxy.create();
    }
}

package com.isa.patterns.proxy.securing;

public class SecuringDataServiceProxy implements DataService {

    private final DataService dataService;
    private final User user;

    public SecuringDataServiceProxy(DataService dataService, User user) {
        this.dataService = dataService;
        this.user = user;
    }

    @Override
    public void read() {
        if (!user.isCanRead()) {
            return;
        }

        dataService.read();
    }

    @Override
    public void update() {
        if (!user.isCanUpdate()) {
            return;
        }

        dataService.update();
    }

    @Override
    public void delete() {
        if (!user.isCanDelete()) {
            return;
        }

        dataService.delete();
    }
}

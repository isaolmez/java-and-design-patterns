package com.isa.patterns.iterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem> {

    private List<MenuItem> menu;
    private int position;

    public PancakeHouseIterator(List<MenuItem> menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        return position < menu.size();
    }

    @Override
    public MenuItem next() {
        return menu.get(position++);
    }
}

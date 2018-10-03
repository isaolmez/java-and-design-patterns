package com.isa.patterns.iterator;

import java.util.LinkedList;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private LinkedList<MenuItem> menu;
    private int position;

    public DinerMenuIterator(LinkedList<MenuItem> menu) {
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

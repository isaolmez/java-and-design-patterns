package com.isa.patterns.compositeiterator;

import java.util.Iterator;

public class CompositeIteratorWithStack implements Iterator<MenuComponent> {

    private Iterator<MenuComponent> innerIter;
    private Iterator<MenuComponent> currentIterator;
    private MenuComponent current;

    public CompositeIteratorWithStack(Iterator<MenuComponent> iter) {
        this.innerIter = iter;
    }

    @Override
    public boolean hasNext() {
        if (currentIterator == null) {
            if (innerIter.hasNext()) {
                current = innerIter.next();
                currentIterator = current.createIterator();
                return true;
            } else {
                return false;
            }
        } else {
            if (currentIterator.hasNext()) {
                current = currentIterator.next();
                return true;
            } else {
                if (innerIter.hasNext()) {
                    current = innerIter.next();
                    currentIterator = current.createIterator();
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public MenuComponent next() {
        return current;
    }
}

package com.isa.patterns.iterator;

public interface Menu<T> {

    Iterator<T> createIterator();
}

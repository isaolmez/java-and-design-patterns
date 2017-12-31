package com.isa.patterns.chainofresponsibility.independent;

public class Input {

    private final String path;

    private final String value;

    public Input(String path, String value) {
        this.path = path;
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Input{" +
                "path='" + path + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

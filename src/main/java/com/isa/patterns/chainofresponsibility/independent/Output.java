package com.isa.patterns.chainofresponsibility.independent;

public class Output {

    private String value;

    private int filteredCount;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getFilteredCount() {
        return filteredCount;
    }

    public void setFilteredCount(int filteredCount) {
        this.filteredCount = filteredCount;
    }

    public void incrementFilteredCount() {
        this.filteredCount++;
    }

    @Override
    public String toString() {
        return "Output{" +
                "value='" + value + '\'' +
                ", filteredCount=" + filteredCount +
                '}';
    }
}

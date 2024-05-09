package org.example;

public class Counter {
    private int count;
    public void reset() {
        count = 0;
    }
   public void click () {
        count++;
    }
    public int getCount () {
        return count;
    }

    @Override
    public String toString() {
        return "the count is "+ count;    }
}
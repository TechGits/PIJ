package org.example;

public class MaxCounter extends Counter {
    int maxClicks = 0;

    @Override
    public void click() {
        super.click();
        if (getCount() > maxClicks) {
            maxClicks = getCount();
        }
    }



    @Override
    public String toString() {
        return "the count is " + getCount() + " and the maximum was " + maxClicks;
    }
}

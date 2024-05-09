package org.example;

public class Main {
    public static void main(String[] args) {
Counter mc = new MaxCounter();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
        mc.reset();
        System.out.println(mc);
        mc.click();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);

    }
}
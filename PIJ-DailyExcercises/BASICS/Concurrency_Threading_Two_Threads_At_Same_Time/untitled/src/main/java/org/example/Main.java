package org.example;

public class Main {
    public static void main(String[] args) {
    MyThread thread1 = new MyThread("One");
    thread1.start();

    MyThread thread2 = new MyThread("Two");
    thread2.start();
    }
}
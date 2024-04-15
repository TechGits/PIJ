package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating and starting a thread by implementing the Runnable interface. the run() mehtod is overriden to pass in parameters
        MyRunnable runnable1 = new MyRunnable("One");
        MyRunnable runnable2 = new MyRunnable("Two");

        // Creating a Thread object, to use the start() methood
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();


    }

}
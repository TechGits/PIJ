package org.example;

public class MyThread extends Thread{
    private String threadName;

    public MyThread(String threadName) {     // Constructor to set the thread name
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread "+threadName+": "+ i);
            try {
                Thread.sleep(500); // Spacer. Sleeps for 1000 milliseconds (1 second) before iterating next loop.
            } catch (InterruptedException e) { // So that an exception is thrown when another thread interrupts while it's sleeping.
                e.printStackTrace();
            }

        }
        System.out.println("Thread "+threadName+" is finished.");
    }
}





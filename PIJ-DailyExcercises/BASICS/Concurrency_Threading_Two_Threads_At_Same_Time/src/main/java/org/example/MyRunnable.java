package org.example;

public class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName)    {
    this.threadName =threadName;

}
    @Override
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Thread "+threadName+": "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        System.out.println("Thread "+threadName+" is finished.");


    }
}

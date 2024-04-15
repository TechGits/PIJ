package org.example;

public class MyRunnable implements Runnable {
    private String threadName1;

    public MyRunnable(String threadName)    {
    this.threadName1 =threadName;

}
    @Override
    public void run(){
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("Thread "+threadName1+": "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        System.out.println("Thread "+threadName1+" is finished.");


    }
}

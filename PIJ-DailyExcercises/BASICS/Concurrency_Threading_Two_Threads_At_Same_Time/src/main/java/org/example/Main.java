package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating and starting a thread by implementing the Runnable interface. the run() method is override to pass in parameters
        MyRunnable runnable1 = new MyRunnable("One");
        MyRunnable runnable2 = new MyRunnable("Two");


        // Creating a Thread object, to use the start() methood
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnableLambdaMethod); // Calls in my static runnableLambdaMethod static method, with different variables.

        thread1.start();
        thread2.start();
        thread3.start();

    }
                // THREAD THREE WITH LAMBDAS
                // --------------------------

                static Runnable runnableLambdaMethod = () -> {
                    String threadName = "Three";

                    for (int i = 50; i < 60; i++) {
                        try {
                            Thread.sleep(500);
                            System.out.println("Thread "+threadName+": "+ i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Thread "+threadName+" is finished.");
                };

    }






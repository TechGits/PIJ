package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating and starting a thread by implementing the Runnable interface. the run() method is override to pass in parameters
        MyRunnable runnable1 = new MyRunnable("#1");

        // Creating a Thread object, to use the start() method
        Thread thread1 = new Thread(runnable1);             // Usses the MyRunnable class (with it's fixed override for loop (1 < 10.
        Thread thread2 = new Thread(runnableLambdaMethod2); // Calls in my static runnableLambdaMethod2 static method, with different variables.
        Thread thread3 = new Thread(runnableLambdaMethod3); // Calls in my static runnableLambdaMethod3 static method, with different variables.

        thread1.start();
        thread2.start();
        thread3.start();
    }
                // THREAD THREE WITH LAMBDAS
                // --------------------------

    //BESPOKE LAMDA 2
    static Runnable runnableLambdaMethod2 = () -> {
        String threadName2 = "#2";

        for (int i = 50; i < 55; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Thread "+threadName2+": "+ i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread "+threadName2+" is finished.");
    };



    //BESPOKE LAMDA 3
                static Runnable runnableLambdaMethod3 = () -> {
                    String threadName3 = "#3";

                    for (int i = 2000; i <= 3000; i+=200) {
                        try {
                            Thread.sleep(500);
                            System.out.println("Thread "+threadName3+": "+ i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Thread "+threadName3+" is finished.");
                };

    }






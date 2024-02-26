This is just a simple programme that demonstrates the Executor Service.
It touches upon the Callable functional interface, and Futures.

The main class allows us to pass in paramaters 10 threads.

Also important to know, the code in the Main method is surrounded by a try/catch, that has the important code:

service.shutdown();
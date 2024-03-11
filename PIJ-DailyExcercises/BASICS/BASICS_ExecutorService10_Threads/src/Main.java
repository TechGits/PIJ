import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                Future<Integer> future = service.submit(new SumCallable(i)); // When submit callable, we get a future in return
                list.add(future);
            }
            for (Future<Integer> f : list) { // Specify the type of Future as Future<Integer>
                System.out.println(f.get());
            }
        } finally {
            // Shutdown the executor service
           service.shutdown();
        }
    }
}

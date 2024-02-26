import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {
    private int input;
    public SumCallable(int input) {
        super();
        this.input = input;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for (int i = 1; i < input; i++) {
            sum = sum+ i;

        }
        return sum;
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Parallel implements Runnable {

    @Override
    public void run() {

        System.out.println("Hello from " + Thread.currentThread().getName());

    }

}



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Parallel implements Runnable {

    @Override
    public void run() {

        System.out.println("Hello from " + Thread.currentThread().getName());

    }

}

//class Main {
//
//    public static void main (String[] args) {
//
//        ExecutorService executor = Executors.newFixedThreadPool(10); //quantity thread
//        executor.submit(new Thread(new Parallel()));
//
//
//
//        executor.shutdown();
////        for (int i=0; i<100; i++) {
////
//////            Thread th = new Thread(new Parallel());
//////            th.start();
////        }
//    }
//
//}

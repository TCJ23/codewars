import java.util.concurrent.ExecutorService;
import java.util.*;
import java.util.concurrent.*;

public class Worker {

    public void execute(Runnable action, int nTimes) {

        final ExecutorService svc = Executors.newFixedThreadPool(500);

        try {

            final List<Future<?>> futures = new ArrayList<>();
            for (int n = 0; n < nTimes; n++) futures.add(svc.submit(action)); // spin off the tasks...
            for (Future<?> f : futures) f.get(); //... and wait for them to complete

        } catch (InterruptedException|ExecutionException ex) {

        } finally {
            svc.shutdownNow();
        }
    }

}
/*
//        Thread[] threads = new Thread[nTimes];
        ExecutorService executorService = Executors.newFixedThreadPool(nTimes);

        for (int i = 0; i < nTimes; i++) {
//            threads[i] = new Thread(action);
//            threads[i].start();
//            action.run(); REMOVE THIS SHIT !!!!!!!!!!
            executorService.submit(action);
        }

//        try {
//            for (Thread thread : threads)
//                thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            executorService.shutdown();
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

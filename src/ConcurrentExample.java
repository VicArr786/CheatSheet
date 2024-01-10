import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }

        System.out.println("All tasks completed");
    }
}

class WorkerThread implements Runnable {
    private final String taskName;

    WorkerThread(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Task = " + taskName);
        // Perform the task
        System.out.println(Thread.currentThread().getName() + " End.");
    }
}

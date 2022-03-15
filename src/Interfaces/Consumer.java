package Interfaces;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    BlockingQueue<String> blockingQueue = null;

    public Consumer(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            String item = blockingQueue.poll();
            System.out.println(item);
            try {
                sleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }
}

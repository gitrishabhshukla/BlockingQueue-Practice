package Interfaces;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    BlockingQueue<String> blockingQueue = null;

    public Producer(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while (true){
            blockingQueue.offer(System.currentTimeMillis()+"");
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

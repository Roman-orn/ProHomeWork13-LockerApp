package app;

import java.util.Arrays;

public class MyThread extends Thread {

    private int[] data;
    private DataHandler dataHandler;

    public MyThread(int[] data, DataHandler dataHandler) {
        this.data = data;
        this.dataHandler = dataHandler;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        System.out.println(Thread.currentThread().getName() + " Data initial: " + Arrays.toString(data));
        System.out.println(Thread.currentThread().getName() + " Data increment: " + Arrays.toString(dataHandler.increment(data)));
    }
}

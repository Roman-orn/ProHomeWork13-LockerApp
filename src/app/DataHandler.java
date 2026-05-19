package app;

import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

    private final ReentrantLock lock = new ReentrantLock();

    public int[] increment(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("No data available!");
        }
        lock.lock();
        try {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < 10_000; j++) {
                    data[i]++;
                }
            }
        } finally {
            lock.unlock();
        }
        return data;
    }
}

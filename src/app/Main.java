package app;

public class Main {

    static void main(String[] args) throws InterruptedException {

        int[] data = new DataRepository().getData();
        DataHandler dataHandler = new DataHandler();

        MyThread myThread1 = new MyThread(data, dataHandler);
        MyThread myThread2 = new MyThread(data, dataHandler);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
    }
}

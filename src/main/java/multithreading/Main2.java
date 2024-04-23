package multithreading;

class MyThread2 implements Runnable{

    public void run() {

        while(1>0) {
            try {
                System.out.println("sleeping for 10s");
                Thread.sleep(10000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("We are in thread 2");
        }
    }
}

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

        thread2.setPriority(6);
        thread2.join();  //Kiling the thread
        thread2.isAlive();
    }
}

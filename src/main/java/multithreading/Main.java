package multithreading;

class MyThread extends Thread{

    public void run(){
        //This method is kindo the main method for our thread

        while(1>0){
            System.out.println("We are in thread 2");
        }
    }

}


public class Main {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

        while(1>0){
            System.out.println("Main method being called !!");
        }


    }
}

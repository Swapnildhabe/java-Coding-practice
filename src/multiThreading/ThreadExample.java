package multiThreading;

import multiThreading.syncronization.MyThread;

class CustomThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i<=50;i++){
            if(i%2==0){
                System.out.println("Even Numbers : "+i);
            }
        }
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=50;i++){
            if(i % 2 !=0){
                System.out.println("Odd Numbers : "+i);
            }
        }
    }
}

class Mythread2 extends Thread implements Runnable {
    Runnable x = ()-> {
        for (int i = 0; i <=50; i++){
            if (i % 2 !=0 ){
                System.out.println("Odd Value: "+ i);
            }
        }
    };
//    Thread thread = new MyThread(t2);


//    Thread t1 = new Thread(() -> {
//        for(int i = 0;i<=50; i++ ){
//            if(i % 2 == 0 ){
//                System.out.println("Even Value : "+ i );
//            }
//        }
//    });
//    @Override
//    public void run() {
//
//    }


}
public class ThreadExample {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
//        t1.start();
//
//        MyThread1 myThread1 = new MyThread1();
//        Thread t2 = new Thread(myThread1);
//        t2.start();

        Mythread2 t3 = new Mythread2();
        Thread th = new Thread(t3);
        th.start();


    }
}


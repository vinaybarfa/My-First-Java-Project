package javaPackage;
class Thread1 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while (i<100){
        System.out.println("Thread 1 is running");
        i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}
public class ThreadsInJava {
    public static void main(String[] args) {
       Thread1 thread1 = new Thread1();
       Thread2 thread2 = new Thread2();
       thread1.start();
       thread2.start();
    }
}
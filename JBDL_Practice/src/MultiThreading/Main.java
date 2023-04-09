package MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        Incrementor incrementor=new Incrementor();
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        for(int i=0;i<1000;i++)
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                incrementor.increment();
            }
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(incrementor.a);


    }
}

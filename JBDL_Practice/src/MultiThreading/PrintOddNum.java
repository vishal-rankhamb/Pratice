package MultiThreading;

import java.util.Random;

public class PrintOddNum implements Task{
    @Override
    public void doSomething() {
        Random random=new Random();
        int i= random.nextInt();
        if(i%2==0){
            i= random.nextInt();
        }
        System.out.println(i);
        System.out.println(Thread.currentThread().getName());
    }
}

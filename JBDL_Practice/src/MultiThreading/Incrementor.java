package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Incrementor {
    Integer a;
    ReentrantLock reentrantLock;

    public Incrementor() {
        this.a = new Integer(0);
        this.reentrantLock=new ReentrantLock();
    }
     void increment(){
        reentrantLock.lock();
        a++;
        reentrantLock.unlock();
    }
}

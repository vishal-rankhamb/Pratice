package MultiThreading;

public class OddEvenPrinter {
    Integer MAX_LIMIT;
    Integer a;

    public OddEvenPrinter(Integer MAX_LIMIT) {
        this.MAX_LIMIT = MAX_LIMIT;
        this.a = 0;
    }
    public void printOdd(){
        synchronized (this){
        while(a<MAX_LIMIT){
            if((a&1)==1){
                System.out.println(Thread.currentThread().getName()+a);
                a++;
                this.notify();
            }else{
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }}
    public void printEven(){
        synchronized (this){
        while(a<MAX_LIMIT){
            if((a&1)==0){
                System.out.println(Thread.currentThread().getName()+a);
                a++;
                this.notify();
            }else{
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
}

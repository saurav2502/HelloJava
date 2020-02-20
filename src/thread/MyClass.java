package thread;

public class MyClass implements Runnable{
    private Thread t1;
    private String threadName;

    public Thread getT1() {
        return t1;
    }

    public void setT1(Thread t1) {
        this.t1 = t1;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public MyClass(String threadName) {
        this.threadName = threadName;
        t1 = new Thread(this,threadName);
        System.out.println("Thread Created: " +  threadName );
        t1.start();
    }

    public MyClass(){

    }

    @Override
    public void run() {
        System.out.println(threadName+" is Running");
        try{
            for (int i = 4; i > 0 ; i--) {
                System.out.println(threadName+" Thread: "+" i: "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println(" Intruppted Thread " +  threadName + " interrupted.");
            e.printStackTrace();
        }
    }

    /*public void start(){
        System.out.println("Starting " +  threadName );
        if (t1 == null){
            t1= new Thread (this, threadName);// New Thread is created

            t1.start ();//run method is called
        }
    }*/
}

class RunnerThread{
    public static void main(String[] args) {
        new MyClass("Thread_1");
        new MyClass("Thread_2");
        new MyClass("Thread_3");

    }
}

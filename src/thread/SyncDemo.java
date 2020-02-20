package thread;

class Sender{
    public void send(String msg){
        System.out.println("sending message..."+msg);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted!");
        }
        System.out.println("\n" + msg + "...Sent Successfully!");
    }

}

class ThreadedSend extends Thread{
    String msg;
    Sender sender;
    public ThreadedSend(String msg, Sender s){
        this.msg = msg;
        this.sender = s;
    }

    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Sender s = new Sender();
        ThreadedSend t = new ThreadedSend("hi",s);
        ThreadedSend t1 = new ThreadedSend("Bye",s);
        t.run();
        t1.run();
    }
}

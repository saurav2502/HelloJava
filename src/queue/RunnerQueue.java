package queue;

public class RunnerQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueqe(5);
        q.enQueqe(2);
        q.enQueqe(7);
        q.enQueqe(3);
        q.enQueqe(10);
        q.display();
        q.deQueue();
        q.enQueqe(9);
        q.enQueqe(1);
        q.display();
    }
}

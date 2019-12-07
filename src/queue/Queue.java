package queue;

public class Queue {
    int front, rear;
    int size;
    int[] queue = new int[5];

    public void enQueqe(int data) {
        queue[rear] = data;
        rear = (rear+1) % 5;
        size = size +1;

    }

    public int deQueue() {
        int data = queue[front];
        front = (front+ 1) %5 ;
        size = size - 1;
        return data;
    }

    public void display() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i)%5] + " ");
        }
    }
}

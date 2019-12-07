package stack;

public class Stack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = -1;

    public void push(int i) {
        if (size() == capacity - 1){
            expand();
        }
        if (!isFull(stack)){
            stack[++top] = i;
        }
    }

    private boolean isFull(int[] stack) {
        if (top == stack.length-1){
            return true;
        }else
            return false;
    }

    private void expand() {
        int length = stack.length;
        int[] Dstack = new int[capacity * 2];
        System.arraycopy(stack,0,Dstack,0,length);
        stack = Dstack;
        int newcapacity = Dstack.length;
        capacity = newcapacity;
    }

    private int size() {
        return top;
    }

    private boolean isEmpty(int[] stack) {
        if (top == -1){
            return true;
        }else
        return false;
    }

    public int pop() {
        int data = 0;
        if (!isEmpty(stack)){
            data = stack[top];
            stack[top] = 0;
            --top;
            shrinc();
        }
        System.out.print(data+" ");
        return data;
    }

    private void shrinc() {
        int len = size();
        if (len <= (capacity / 2) / 2) {
            capacity = capacity / 2;
            int[] newstack = new int[capacity];
            System.arraycopy(stack, 0, newstack, 0, len+1);
            stack = newstack;
        }
    }


    /*private boolean isFull(int[] stack) {
        if (top == stack.length-1){
            return true;
        }else
            return false;
    }*/

    public void show() {
        for (int a: stack
             ) {
            System.out.print(a+" ");
        }
    }
}

package stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("pushing start");
        stack.push(1);
        stack.push(2);
        //stack.show();
        stack.push(3);
        stack.push(4);
        stack.show();
        System.out.println();
        System.out.println("poping starts");
        //stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        System.out.println("poping ends");
        //stack.pop();
       // stack.push(5);
        //stack.pop();
        System.out.println("Remaing Array");
        stack.show();
    }
}

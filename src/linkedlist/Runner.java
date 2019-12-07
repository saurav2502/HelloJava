package linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.display();
        list.insertAtStart(5);
        list.insertAt(15,3);
        list.display();
        list.insertAtLast(80);
        list.insertAt(35,4);
        list.display();
        list.insertAt(55,0);
        list.display();
        list.delete(35,0);
    }
}

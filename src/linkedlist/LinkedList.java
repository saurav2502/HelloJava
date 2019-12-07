package linkedlist;

public class LinkedList {
    Node head;

    public void insertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node dhead = head;
            while (dhead.next != null) {
                dhead = dhead.next;
            }
            dhead.next = node;
        }
    }

    public void display() {
        Node n = head;
        while (n.next != null) {
            System.out.print("[" + n.data + "]" + " -> ");
            n = n.next;
        }
        System.out.println("[" + n.data + "]");
    }

    public void insertAt(int data, int index) {
        if (index ==0){
            insertAtStart(data);
        }else {
            Node node = head;
            Node node1 = new Node(data);
            for (int i = 0; i < index -1 ; i++) {
                node = node.next;
            }
            node1.next = node.next;
            node.next = node1;
        }

        //display();
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        //display();
    }

    public void insertAtLast(int i) {
        Node node = new Node(i);
        Node dhead = head;
        while (dhead.next != null){
            dhead = dhead.next;
        }
        dhead.next = node;
        display();
    }

    public void delete(int data, int index) {
        if (index == 0){
            head = head.next;
        }
        else {
            Node node = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            n1 = node.next;
            node.next = n1.next;
            display();
        }
    }
}


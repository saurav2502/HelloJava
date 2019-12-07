package codingsimplify.linkedkist;

public class LinkedListApp {
    private Node getNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public Node insert(Node root, int data) {
        if (root == null){
            return getNewNode(data);
        }else {
            root.next = insert(root.next,data);
        }
        return root;
    }


    public void printRoot(Node root) {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        printRoot(root.next);
    }

    public Node insertAtBegining(Node root, int data) {
        Node node = getNewNode(data);
        node.next = root;
        return node;
    }

    public Node insertAtPosition(Node root, int data, int position) {
        if (position < 1){
            System.out.println("position can't be less than 1");
            return root;
        }
        // if root size is lower than the position requested to inserted ex..if root is of size 2 and insertion is going for third position.
        if (root == null && position > 1){
            System.out.println("Postion is greater than the element exists");
            return root;
        }
        // if root is null, then create new node and return
        if (root == null && position == 1){
            return getNewNode(data);
        }
        if (position == 1){
            Node node = getNewNode(data);
            node.next = root;
            return node;
        }
        root.next = insertAtPosition(root.next,data,position-1);
        return root;
    }

    public Node deleteNode(Node root) {
        if (root == null || root.next == null)
            return null;
        Node temp = root;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return root;
    }

    public Node deleteAtPosition(Node root, int pos) {
        // node does not exist
        if (pos < 1){
            return null;
        }
        //  node does not exist
        if (root == null || root.next == null)
            return null;
        //delete index is of greater length
        if (root == null && pos > 1){
            System.out.println("delete index is higher as node does not exist");
            return root;
        }
        if (pos == 1){
            return root.next;
        }
        root.next = deleteAtPosition(root.next,pos-1);
        return root;
    }

    public int getLinkedlistSize(Node node){
        if (node == null)
            return 0;
        else{
            return getLinkedlistSize(node.next)+1;
        }
    }

    public boolean findElement(Node root, int i) {
        if (root == null){
            return false;
        }else {
            if (root.data == i){
                return true;
            }else
               return findElement(root.next,i);
        }
    }

    public Node rotateList(Node root, int val) {
        if (root == null){
            return root;
        }else {
            int k = getLinkedlistSize(root);
            val = val % k;
            if (val == 0){
                return root;
            }
            Node node = root;
            for (int i = 1; i < k-val  ; i++) {
                node = node.next;
            }
            Node tmp = node.next;
            Node head = tmp;
            node.next = null;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = root;
            return head;

        }
    }

    public Node rotateAntiClock(Node root, int k) {
        if (root == null || k < 0){
            return root;
        }
        int size = getLinkedlistSize(root);
        k = k % size;
        if (k == 0){
            return root;
        }
        Node node = root;
        int i = 1;
        while (i < k){
            node = node.next;
            i++;
        }
        Node temp = node.next;
        Node head = temp;
        node.next = null;
        i = 1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public Node reverseList(Node root) {
        if (root == null || root.next == null){
            return root;
        }else {
            Node revlist = reverseList(root.next);
            printRoot(revlist);
            System.out.print("["+root.data+"]"+" -> ");
            root.next.next = root;
            root.next = null;
            return  revlist;
        }
    }

    public Node reverseByIterateList(Node root) {
        if (root == null || root.next == null){
            return root;
        }else {
            Node prev = null,next = null;
            while (root != null){
                next = root.next;
                root.next = prev;
                prev = root;
                root = next;
            }
            return prev;
        }
    }
}

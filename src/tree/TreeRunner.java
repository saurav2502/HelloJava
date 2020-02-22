package tree;

public class TreeRunner {
    public static void main(String[] args) {
        BSTapp bsTapp = new BSTapp();
        TreeNode node = null;
        node = bsTapp.insertNode(node, 8);
        node = bsTapp.insertNode(node, 10);
        node = bsTapp.insertNode(node, 14);
        node = bsTapp.insertNode(node, 13);
        node = bsTapp.insertNode(node, 3);
        node = bsTapp.insertNode(node, 1);
        node = bsTapp.insertNode(node, 6);
        node = bsTapp.insertNode(node, 4);
        /*node = bsTapp.insertNode(node, 6);*/
        node = bsTapp.insertNode(node, 7);
        node = bsTapp.deleteNode(node,3);
        //bsTapp.findRightNode(node);
        //node = bsTapp.inOrderTraverse(node);
        //node = bsTapp.findParent(node, 8);
        /*if (node != null) {
            System.out.println();
            System.out.println("parent of 81 is = " + node.data);
        } else {
            System.out.println();
            System.out.println("parent does not exist");
        }*/
        /*node = bsTapp.findSibling(node, 4);
        if (node == null) {
            System.out.println();
            System.out.println("not exist");
        } else {
            System.out.println();
            System.out.println(node.data);
        }*/
       /* node = bsTapp.findInorderParent(node, 8);*/
        /*node = bsTapp.findInorderSuccessor(node, 13);
        if (node == null) {
            System.out.println();
            System.out.println("not exist");
        } else {
            System.out.println();
            System.out.println("Inorder Parent: "+node.data);
        }*/
        /*System.out.println(bsTapp.findOddEvenSumDiff(node));*/
        //System.out.println(bsTapp.findMaxElement(node));
        //System.out.println(bsTapp.findMinElement(node));
    }
}

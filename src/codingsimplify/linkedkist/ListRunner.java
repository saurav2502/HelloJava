package codingsimplify.linkedkist;

public class ListRunner {
    public static void main(String[] args) {
        Node root = null;
        LinkedListApp listApp = new LinkedListApp();
        root = listApp.insert(root, 12);
        root = listApp.insert(root, 99);
        root = listApp.insert(root, 37);
        root = listApp.insert(root, 8);
        root = listApp.insert(root, 18);
        root = listApp.insert(root, 10);
        boolean b = listApp.checkLoop(root);
        root = listApp.findMiddleElement(root);
        System.out.println(root.data);
        //listApp.printRoot(root);
        //inserting at beginning as 5
        /*root = listApp.insertAtBegining(root, 5);
        System.out.println("node inserted at begining");
        listApp.printRoot(root);*/
        //inserting at some different position
       /* root = listApp.insertAtPosition(root, 5, 2);
        System.out.println("node inserted at position 1");
        listApp.printRoot(root);*/

        //to delete the last node of list
        //root = listApp.deleteNode(root);
        /*root = listApp.deleteAtPosition(root,2);
        System.out.println("After deleteion of last node");*/
        /*int len = listApp.getLinkedlistSize(root);
        System.out.println("size : "+len);*/
        /*boolean result = listApp.findElement(root,37);*/
        /*root = listApp.rotateList(root,8);*/
        /*root = listApp.rotateListAnticlock(root,8);*/
        /*root = listApp.rotateAntiClock(root,2);
        listApp.printRoot(root);*/
        /*System.out.println();*/
        /*root = listApp.reverseList(root);
        listApp.printRoot(root);*/
        //root = listApp.reverseNode(root);
        /*root = listApp.reverseByIterateList(root);*/

    }
}

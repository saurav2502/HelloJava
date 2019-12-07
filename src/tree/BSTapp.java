package tree;

public class BSTapp {

    public TreeNode insertNode(TreeNode node, int data) {
        if (node == null) {
            return createNewNode(data);
        }
        if (data > node.data) {
            node.right = insertNode(node.right, data);
        } else if (data < node.data) {
            node.left = insertNode(node.left, data);
        }
        return node;
    }

    private TreeNode createNewNode(int data) {
        TreeNode root = new TreeNode(data);
        return root;
    }

    public TreeNode deleteNode(TreeNode node, int i) {
        if (node == null) {
            return null;
        }
        if (node.data < i) {
            node.right = deleteNode(node.right, i);
        } else if (node.data > i) {
            node.left = deleteNode(node.left, i);
        } else {
            //applicable for delete leaf node
            if (node.left == null || node.right == null) {
                TreeNode temp = null;
                temp = node.left == null ? node.right : node.left;
                if (temp == null) {
                    return null;
                } else {
                    return node;
                }
            } else {
                TreeNode tempnode = getsuccessor(node);
                node.data = tempnode.data;
                node.right = deleteNode(node.right, tempnode.data);
                return node;
            }
        }
        return node;
    }

    private TreeNode getsuccessor(TreeNode node) {
        if (node == null) {
            return null;
        } else {
            TreeNode treeNode = node.right;
            while (treeNode.left != null) {
                treeNode = treeNode.left;
            }
            return treeNode;
        }
        /*return node;*/
    }

    public TreeNode inOrderTraverse(TreeNode node) {
        if (node == null) {
            return null;
        } else {
            if (node.left != null) {
                node.left = inOrderTraverse(node.left);
            }
            System.out.print(node.data + " ");
            if (node.right != null) {
                node.right = inOrderTraverse(node.right);
            }
        }
        return node;
    }

    public TreeNode findParent(TreeNode node, int i) {
        TreeNode temp = null;
        if (node == null) {
            return null;
        } else {

            while (node != null) {
                if (i > node.data) {
                    temp = node;
                    node = node.right;
                } else if (i < node.data) {
                    temp = node;
                    node = node.left;
                } else {
                    break;
                }
            }
        }
        return node != null ? temp : null;
    }

    public TreeNode findSibling(TreeNode node, int i) {
        TreeNode temp = null;
        if (node == null) {
            return null;
        } else {
            while (node != null) {
                if (i > node.data) {
                    temp = node;
                    node = node.right;
                } else if (i < node.data) {
                    temp = node;
                    node = node.left;
                } else {
                    if (temp != null) {
                        if (temp.data > i) {
                            temp = temp.right;
                            break;
                        } else {
                            temp = temp.left;
                            break;
                        }

                    } else return null;
                }
            }
        }
        return node != null ? temp : null;
    }

    public TreeNode findInorderParent(TreeNode node, int data) {
        TreeNode retnode = null;
        if (node == null){
            return null;
        }else {
            while (node != null){
                if (data > node.data){
                    node = node.right;
                }else if (data < node.data){
                    retnode = node;
                    node = node.left;
                }else {
                    break;
                }
            }

        }
        return retnode;
    }

    public TreeNode findInorderSuccessor(TreeNode node, int data) {
        TreeNode retnode = null;
        if (node == null){
            return null;
        }else {
            while (node != null){
                if (data > node.data){
                    node = node.right;
                }else if (data < node.data){
                    retnode = node;
                    node = node.left;
                }else {
                    if (node.right != null){
                        retnode = getsuccessor(node);
                    }
                    break;
                }
            }
        }
        return node != null? retnode : null;
    }

    public int findOddEvenSumDiff(TreeNode node) {
        if (node == null)
            return 0;
        else
            return node.data - findOddEvenSumDiff(node.left) - findOddEvenSumDiff(node.right);
    }

    public int findMaxElement(TreeNode node) {
        if (node == null){
            return 0;
        }else {
            while (node.right != null){
                node = node.right;
            }
            return node.data;
        }
    }

    public int findMinElement(TreeNode node) {
        if (node == null){
            return 0;
        }else {
            while (node.left != null){
                node = node.left;
            }
            return node.data;
        }
    }
}

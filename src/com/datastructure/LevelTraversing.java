package com.datastructure;

public class LevelTraversing {


    public  void printAllNodes(TreeNode root) {
        TreeQueue queue = new TreeQueue();
        if (root == null) return;
        queue.enQueue(root);
        while (queue.isEmpty()) {
            TreeNode node= queue.deQueue();
            System.out.println(node.getData());
            if (node.getLeft() != null) {
                queue.enQueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enQueue(node.getLeft());
            }

        }

    }
}

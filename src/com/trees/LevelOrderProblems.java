package com.trees;

import java.util.LinkedList;

public class LevelOrderProblems {

    public  TreeNode createTree() {
        TreeNode root =  new TreeNode();
        root.item = 1;
        root.left = new TreeNode();
        root.right = new TreeNode();
        root.left.item = 2;
        root.right.item= 3;

        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.left.left.item = 4;
        root.left.right.item= 5;

        //root.right.right = new TreeNode();
        root.right.left = new TreeNode();
        root.right.left.item = 6;
        //root.right.right.item= 7;
        return root;
    }

    public static void main(String[] args) {
        LevelOrderProblems levelOrderProblems = new LevelOrderProblems();
        TreeNode root = levelOrderProblems.createTree();
        levelOrderProblems.printLevelOrder(root);
        levelOrderProblems.sumOfEachLevel(root);
    }

    /*
              1
          2       3
        4  5    6   7
   */

    public void printLevelOrder(TreeNode root) {
        System.out.println("Printing tree level order");

        LinkedList<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            System.out.println("nothing to print ");
            return;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.print(" " + temp.item);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    public void sumOfEachLevel(TreeNode root) {
        // main thing is that for each level put a marker in the queue so that we can print it

        System.out.println("Printing sum each level");
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        queue.add(null);
        while (!queue.isEmpty()) {
            int sum = 0;
            TreeNode temp;
            while((temp = queue.remove()) != null) {
                sum += temp.item;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println(level + "," + sum);
            level++;
            if (!queue.isEmpty()) queue.add(null);
        }


    }

}

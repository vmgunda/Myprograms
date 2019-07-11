package com.trees;

import java.util.LinkedList;
import java.util.Stack;

public class BSTProblems {

    public int kthSmallestElementBST(TreeNode root, int k, int count) {
        // Traverse to the left
        // if it hits not hits the bottom then return the left
        // if it hits the bottom, check the kth number
        //    if yes, return root value
        //    if no, then traverse towards the right

        if (root == null) return Integer.MAX_VALUE;
        int left = kthSmallestElementBST(root.left, k, count);
        if (left != Integer.MAX_VALUE) {
            return left;
        }
        if (++count == k) {
            return root.item;
        }
        return kthSmallestElementBST(root.right, k, count);
    }

    public int kthLargestElementBST(TreeNode root, int k, int count) {
        if (root == null) return Integer.MIN_VALUE;

        int rightValue = kthSmallestElementBST(root.right, k, count);
        if (rightValue != Integer.MIN_VALUE) {
            return rightValue;
        }
        if (++count == k) {
            return root.item;
        }
        return kthSmallestElementBST(root.left, k, count);
    }

    public void printZigZag(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currentLevel.push(root);
        boolean leftToRight = true;
        while(queue.isEmpty()) {
            TreeNode temp = currentLevel.pop();
            System.out.println(temp.item);
            if (leftToRight) {
                if (temp.left != null) {
                    nextLevel.push(temp.left);
                }
                if (temp.right != null) {
                    nextLevel.push(temp.right);
                }
            } else {
                if (temp.right != null) {
                    nextLevel.push(temp.right);
                }
                if (temp.left != null) {
                    nextLevel.push(temp.left);
                }
            }

            if (leftToRight) {
                leftToRight = !leftToRight;
                //swap(currentLevel, nextLevel);
            }
        }
    }






    public TreeNode findInorderSuccessor(TreeNode root, int key) {
        // if key is found then minimum of right most is the successor
        // if key is lesser than root then check left child
        // if key is greate than root then check right child

        if (root == null) return null;

        if (root.item == key) {
            return findMinimum(root.right);
        }

        if (root.item < key) {
            return findInorderSuccessor(root.right, key);
        } else {
            return findInorderSuccessor(root.left, key);
        }

    }

    private TreeNode findMinimum(TreeNode root) {
        while (root != null) {
            root = root.left;
        }
        return root;
    }

    //           10
    //       8       13
    //     7   9   12    14
    public TreeNode createBinaryTree() {
        TreeNode root =  new TreeNode();
        root.item = 10;
        root.left = new TreeNode();
        root.right = new TreeNode();
        root.left.item = 8;
        root.right.item= 13;

        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.left.left.item = 7;
        root.left.right.item= 9;

        root.right.right = new TreeNode();
        root.right.left = new TreeNode();
        root.right.left.item = 12;
        root.right.right.item= 14;
        return root;

    }
}

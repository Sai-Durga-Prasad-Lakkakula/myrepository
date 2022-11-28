//finding out the length of the longest path which contains nodes with the exact same value

package com.colection.Sets;

public class LongestPath {
    static class Node{
        int val;
        Node left, right;
    };
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.val = data;
        temp.left = temp.right = null;
        return temp;
    }
    public static void main(String[] args){
        Node root = null;
        root = newNode(1);
        root.left = newNode(4);
        root.right = newNode(5);
        root.left.left = newNode(4);
        root.left.right = newNode(4);
        root.right.right = newNode(5);
        System.out.print(longestSamevaluePath(root));
    }
    static int res = 0;
    public static int longestSamevaluePath(Node root){
        if(root == null) return 0;
        solve(root);
        return res;
    }

    public static int solve(Node root) {
        if(root == null) return 0;

        int lHeight = solve(root.left);
        int rHeight = solve(root.right);
        int lchk = 0;
        int rchk = 0;
        if(root.left != null && root.left.val == root.val){
            lchk = lHeight + 1;
        }

        if(root.right != null && root.right.val == root.val){
            rchk = rHeight + 1;
        }

        res = Math.max(res, lchk + rchk);
        return Math.max(lchk, rchk);

    }
}

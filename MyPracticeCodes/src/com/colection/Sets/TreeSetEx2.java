//retrive elements using treeset

package com.colection.Sets;

public class TreeSetEx2 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            System.out.print(nodes[idx]+" ");
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }
        public static void preorder(Node root)
        {
            if(root == null)
            {
                //System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root)
        {
            if(root == null)
            {
                //System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root)
        {
            if(root == null)
            {
                //System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static <BinaryTreeNode> void display_inorder(BinaryTreeNode root) {
        }
    }
    public static void main(String [] args)
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println();
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);

    }
}

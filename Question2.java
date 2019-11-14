import java.util.*;

public class Question2 {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node()
        {
            left = null;
            right = null;
        }
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        if(root.data > data)
        {
            root.left = insert(root.left,data);
        }
        else if(root.data < data)
        {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static int getHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int lHeight = 1 + getHeight(root.left);
            int rHeight = 1 + getHeight(root.right);

            return Math.max(lHeight,rHeight);
        }
    }
    static Stack<Integer> getOrder = new Stack<Integer>();
    public static void getLevelOrder(Node root)
    {
        int h = getHeight(root);
        for(int i = 0 ; i < h ; i++)
        {
            getLevel(root,i);
        }
        System.out.println();
    }
    public static void getLevel(Node root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == 0)
        {
            getOrder.push(root.data);
        }
        else
        {
            getLevel(root.left,level - 1);
            getLevel(root.right,level - 1);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(40);
        root = insert(root,30);
        root = insert(root,70);
        root = insert(root,20);
        root = insert(root,35);
        root = insert(root,50);
        root = insert(root,80);
        getLevelOrder(root);
        while(!getOrder.empty())
        {
            System.out.print(getOrder.peek() + " ");
            getOrder.pop();
        }
    }

}

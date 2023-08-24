package BinaryTree;

import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;


import java.util.LinkedList;

public class BinaryTreeBasics {

    static Scanner scan = new Scanner(System.in);

    static class Node {
        Integer data;
        Node left;
        Node right;
    
        public Node(Integer data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node buildTree(){

        int data = scan.nextInt();

        if(data == -1){
            return null;
        }

        Node n =new Node(data);
        n.left = buildTree();
        n.right = buildTree();
        return n;
      
    }

    public static void printPreOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printInorder(Node root){
        if(root == null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + ", ");
        printInorder(root.right);
        
    }

    public static void printLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.poll();
            System.out.print(temp.data);

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
            
        }
        
    }

    public static void main(String[] args) throws IOException {

        Node root = buildTree();
        printLevelOrder(root);
       
    }
    
}

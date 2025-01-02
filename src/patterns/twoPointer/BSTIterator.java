//package patterns.twoPointer;
//
//
//import java.util.Stack;
//
//class TreeNode {
//      int val;
//     TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//
//// BSTIterator class for iterating through BST nodes
//class BSTIterator {
//    // Stack to store nodes
//    private Stack<TreeNode> myStack;
//    // Flag to determine traversal direction
//    private boolean reverse;
//
//    // Constructor initializing BSTIterator with the
//    // root of the BST and traversal direction
//    BSTIterator(TreeNode root, boolean isReverse) {
//        myStack = new Stack<>();
//        reverse = isReverse;
//        // Initialize the stack with nodes
//        pushAll(root);
//    }
//
//    // Checks if there exists a
//    // next element in the BST
//    boolean hasNext() {
//        // Returns true if the
//        // stack is not empty
//        return !myStack.empty();
//    }
//
//    // Retrieves the next smallest element
//    // ie. inorder successor in the BST
//    int next() {
//        // Retrieve the top node from the stack
//        TreeNode tmpNode = myStack.pop();
//        if (!reverse) {
//            // If not in reverse mode,
//            // add nodes from the right subtree
//            pushAll(tmpNode.right);
//        } else {
//            // If in reverse mode,
//            // add nodes from the left subtree
//            pushAll(tmpNode.left);
//        }
//        // Return the value of the retrieved node
//        return tmpNode.val;
//    }
//
//    // Helper function to push nodes into
//    // the stack in a specific order
//    private void pushAll(TreeNode node) {
//        while (node != null) {
//            // Push the node onto the stack
//            myStack.push(node);
//            if (reverse) {
//                // Move to the right child
//                // if in reverse mode
//                node = node.right;
//            } else {
//                // Move to the left child
//                // if not in reverse mode
//                node = node.left;
//            }
//        }
//    }
//}

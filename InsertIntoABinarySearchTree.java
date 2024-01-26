/*
    701
    You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. 
    It is guaranteed that the new value does not exist in the original BST.

    Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. 
    You can return any of them.

    

Example 1:


Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
Explanation: Another accepted tree is:

Example 2:

Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]
Example 3:

Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]
 */

public class InsertIntoABinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode curr = root;
        while (true) {
            if (curr.val <= val) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new TreeNode(val);
                    break;
                }
            } else {

                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new TreeNode(val);
                    break;
                }

            }
        }
        return root;
    }

    public static void main(String[] args) {

    }

}

/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

Just do a simple modified binary search and make the mid element as the root 

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        TreeNode root = null;
        if (nums.length==0) {
            return root;
        }
        root = getBinaryTree (0,nums.length-1,nums);
        return root;
        
    }
    
    public TreeNode getBinaryTree( int start,int end,int [] nums) {
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        if (start > end) { 
        return null;
        }
  
        root.left = getBinaryTree(start,mid-1,nums);
        root.right = getBinaryTree(mid+1,end,nums);
      
        return root;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Long,Integer> map = new HashMap<>();
    int count = 0 ;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        map.put(0L,1);
        fn( root, targetSum , 0L);
        return count ;
    }

    public void fn(TreeNode root, int target , long currSum){

        if(root==null){
            return;
        }

        currSum+=root.val ;
        
        if(map.containsKey(currSum-target)){
            count+=map.get(currSum-target) ;
        }
        map.put(currSum , map.getOrDefault(currSum,0)+1);

        fn(root.left , target , currSum);
        fn(root.right , target , currSum);

        map.put(currSum , map.get(currSum)-1);
    }
}
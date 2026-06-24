class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0 ;
        for(int num:nums){
            total+=num;
        }

        int n = nums.length ;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n];
        for(int i=0 ; i<n-1 ; i++){
            leftSum[i+1] = nums[i]+leftSum[i];
            rightSum[i] = total-(nums[i]+leftSum[i]);
            // [10,4,8,3] : nums
            // [0,10,14,22] : leftSum
            // [15,11,3,0] : rightSum
            System.out.println(leftSum[i]+" " + rightSum[i]);
            // System.out.println(leftSum[i+1]+" " + rightSum[i+1]);

            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        ans[n-1] = total-nums[n-1] ;
        
        return ans ;
    }
}
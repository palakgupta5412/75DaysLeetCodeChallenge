class Solution {
    int sum ;
    public boolean canPartition(int[] nums) {
        
        int n = nums.length ;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false ;
        int target = sum/2 ;
        Boolean[][] dp = new Boolean[n][target+1];

        return fn(dp,nums,n-1,target);
    }

    public boolean fn(Boolean[][] dp , int[] nums , int idx , int sum){

        if(idx==0){
            return nums[idx]==sum ;
        }

        if(sum==0){
            return true ;
        }

        if(dp[idx][sum]!=null){
            return dp[idx][sum];
        }

        boolean notTake = fn(dp,nums,idx-1,sum);
        boolean take = false ;
        if(nums[idx]<=sum){
            take = fn(dp,nums,idx-1,sum-nums[idx]);
        }

        return dp[idx][sum] = take||notTake ;
    }
}
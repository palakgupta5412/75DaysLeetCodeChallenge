class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l = 0 ;
        int r = 0 ;
        int n = nums.length ;
        int minLen = Integer.MAX_VALUE ;
        int sum = 0 ;

        while(r<n){
            sum+=nums[r];

            while(sum>=target){
                minLen = Math.min(r-l+1 , minLen);
                sum-=nums[l];
                l++;
            }
            r++ ;
        }
        return minLen==Integer.MAX_VALUE ? 0 : minLen ;
    }
}
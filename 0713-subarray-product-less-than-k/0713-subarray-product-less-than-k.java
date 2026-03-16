class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0 ;
        int r = 0 ;
        if(k<=1){
            return 0 ;
        }
        int count = 0 ;
        int n = nums.length ;
        int prod = 1 ;
        while(r<n){
            prod*=nums[r];
            while(prod >= k && l<=r){
                prod=prod/nums[l];
                l++;
            }
            count+=(r-l+1);
            r++ ;
        }
        return count ;
    }
}
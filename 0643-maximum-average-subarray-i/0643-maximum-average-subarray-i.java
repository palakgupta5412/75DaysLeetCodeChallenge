class Solution {
    double ans = 0 ;
    public double findMaxAverage(int[] nums, int k) {
        int left = 0 ;
        int sum = 0 ;
        int n = nums.length ;
        for(int i=0 ; i<k ; i++){
            sum+=nums[i];
        }

        ans = sum ;

        for(int i=k ; i<n ; i++){
            sum+=nums[i];
            sum-=nums[i-k];

            ans = Math.max(sum,ans);
        }
        return (double)(ans/k) ;
    }
}
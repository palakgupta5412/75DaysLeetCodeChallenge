class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length ;
        int[] pre = new int[n];
        pre[0]=nums[0];
        int sum = 0 ;
        sum+=nums[0];

        for(int i=1 ; i<n ; i++){
            pre[i]=nums[i]+pre[i-1];
            sum+=nums[i];
        }

        for(int i=0 ; i<n ; i++){
            int left = 0 ;
            int right = 0 ;
            if(i==0){
                left = 0 ;
                right = sum-pre[0];
            }
            else if(i==n-1){
                right = 0 ;
                left = sum-nums[n-1];
            }
            else{
                left = pre[i-1];
                right = sum-pre[i];
            }

            if(left==right){
                return i ;
            }
        }
        return -1 ;
    }
}
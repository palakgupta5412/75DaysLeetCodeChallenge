class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1 ;
        int zeros = 0 ;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
                zeros++;
            }
            else{
                prod*=nums[i];
            }
        }

        int[] ans = new int[nums.length];
        if(zeros>1){
            return ans ;
        }

        if(zeros == 1){
            for(int i=0 ; i<nums.length ; i++){
                if(nums[i]==0){
                    ans[i]=prod ;
                    break ;
                }
            }
            return ans ;
        }

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
                ans[i]=prod ;
            }else{
                ans[i] = prod/nums[i];
            }
        }
        return ans ;
    }
}
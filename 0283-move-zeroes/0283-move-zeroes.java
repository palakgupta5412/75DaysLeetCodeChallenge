class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
        int i = 0 ; 
        int j = n-1 ;

        int[] ans = new int[n];

        for(int k=0 ; k<n ; k++){
            if(nums[k]==0){
                ans[j]=nums[k];
                j--;
            }
            else{
                ans[i]=nums[k];
                i++;
            }
        }
        for(int idx=0 ; idx<n ; idx++){
            nums[idx]=ans[idx];
        }
        
    }
}
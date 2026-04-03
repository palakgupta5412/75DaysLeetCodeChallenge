class Solution {
    public int search(int[] nums, int target) {
        int sI = 0 ;
        int eI = nums.length -1 ;

        while(sI<=eI){
            int mid = sI + (eI - sI)/2 ;
            if(nums[mid]==target){
                return mid ;
            }
            if(nums[mid]>target){
                eI = mid-1 ;
            }
            else{
                sI = mid+1 ;
            }
        }

        return -1 ;
    }
}
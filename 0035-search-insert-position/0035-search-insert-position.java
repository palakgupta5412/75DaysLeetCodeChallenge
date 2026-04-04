class Solution {
    public int searchInsert(int[] nums, int target) {

        // //edge cases :
        // if(nums[0]>target){
        //     return 0 ;
        // }
        // if(nums[nums.length-1]<target){
        //     return nums.length ;
        // }

        // //Iteration :
        // int sI=0;
        // int eI = nums.length;
        // while(sI<=eI && sI<nums.length && eI>=0){
        //     int mid = (sI+eI)/2 ;
        //     if(nums[mid]==target){
        //         return mid ;
        //     }
        //     if(mid!=nums.length-1 && nums[mid]<target && nums[mid+1]>target){
        //         return mid+1 ;
        //     }
        //     if(mid!=0 && nums[mid-1]<target && nums[mid]>target){
        //         return mid ;
        //     }
        //     if(nums[mid]>target){
        //         sI=mid+1;
        //     }
        //     else{
        //         eI=mid-1;
        //     }
        // }
        // return (sI+eI)/2 ;
        int ans=Arrays.binarySearch(nums,target);
        if(ans<0){
            return -ans-1;
        }
        return ans;
    }
}
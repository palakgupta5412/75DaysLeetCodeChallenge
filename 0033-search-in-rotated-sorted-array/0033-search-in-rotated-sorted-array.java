class Solution {

    //This works only for arrays with no duplicate values , for duplicate values consider the program in spiral pad 
    public int search(int[] nums, int target) {
        int idx = returnPivotEleIndex(nums);

        if(idx==-1){
            return binarySearchInRange(nums,target,0,nums.length-1);
        }
        int ans = binarySearchInRange(nums,target,0,idx);
        if(ans!=-1){
            return ans;
        }
        else{
            return binarySearchInRange(nums,target,idx+1,nums.length-1);
        }
    }

    public int returnPivotEleIndex(int nums[]) {
		
		int sI = 0 ;
		int eI = nums.length-1;
		
		while(sI<=eI) {
			int mid = sI + (eI-sI)/2 ;
			 
            if(eI>=mid+1 && nums[mid]>nums[mid+1]){
                return mid ;
            }
            if(sI<=mid-1 && nums[mid]<nums[mid-1]){
                return mid-1 ;
            }
			if(nums[sI]<=nums[mid]) {
				sI = mid+1 ;
			}
			else {
				eI = mid-1;
			}
		}
		return -1 ;
	}
    public int binarySearchInRange(int nums[] , int target , int sI ,int eI){
        while(sI<=eI){
            int mid=sI+(eI-sI)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                eI = mid-1;
            }
            else{
                sI=mid+1 ;
            }
        }
        return -1;
    }

}


class Solution {
    public int findMin(int[] nums) {
        int idx = returnPivotEleIndex(nums);
        if(idx==-1){
            return nums[0];
        }
        else{
            return nums[idx+1];
        }
    }
    public int returnPivotEleIndex(int nums[]) {
		
		int sI = 0 ;
		int eI = nums.length-1;
		
		while(sI<=eI) {
			int mid = sI + (eI-sI)/2 ;
			if(mid+1<=eI && nums[mid]>nums[mid+1]) {
				return mid ;
			} 
			if(mid-1>=sI && nums[mid]<nums[mid-1]){
				return mid-1;
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
}
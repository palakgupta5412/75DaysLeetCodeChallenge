class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length ;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int x = nums[i] ;
            twosum(x,nums,i+1,-x,ans);
        }
        return ans ;
    }

    public void twosum(int curr , int[] nums , int start , int sum, List<List<Integer>> ans){
        int left = start ;
        int n = nums.length ;
        int right = n-1 ;
        while(left<right){
            if(nums[left]+nums[right]==sum){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(curr);
                temp.add(nums[left]);
                temp.add(nums[right]);
                ans.add(new ArrayList<>(temp));
                while(left < right && nums[left] == nums[left + 1]) left++;
                while(left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            }else if(nums[left]+nums[right]<sum){
                left++;
            }else{
                right-- ;
            }
        }
    }
}
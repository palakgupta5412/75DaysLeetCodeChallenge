class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int n = nums.length ;
        for(int i=0 ; i<n ; i++){
            if(map.contains(nums[i])){
                return true ;
            }
            map.add(nums[i]);
        }
        return false;
    }
}
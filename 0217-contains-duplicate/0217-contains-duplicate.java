class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length ;
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                return true ;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
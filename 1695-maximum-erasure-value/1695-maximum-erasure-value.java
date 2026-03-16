class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0 ;
        int r = 0 ;

        int maxSum = 0 ;
        Map<Integer,Integer> map = new HashMap<>(); //nums[i],index
        int n = nums.length ;

        int max = 0 ;
        int sum = 0 ;
        while(r<n){
            int ele = nums[r];
            if(map.containsKey(ele) && map.get(ele)>=l){
                for(int i=l ; i<=map.get(ele) ; i++){
                    sum-=nums[i];
                }
                l=map.get(ele)+1;
            }

            map.put(ele,r);
            sum += nums[r];
            max = Math.max(sum , max);
            r++;
        }
        return max ;
    }
}
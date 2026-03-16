class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0 ;
        int r = 0 ;
        int n = nums.length ;
        long max = 0 ;
        long sum = 0 ;

        Map<Integer,Integer> map = new HashMap<>();

        while(r<n){
            int ele = nums[r];
            if(map.containsKey(ele) && map.get(ele)>=l){
                for(int i=l ; i<map.get(ele)+1 ; i++){
                    sum-=nums[i];
                }
                l = map.get(ele)+1 ;
            }
            while(r-l+1>k){
                sum-=nums[l];
                l++;
            }
            map.put(ele,r);
            sum+=nums[r];
            

            if(r-l+1==k){
                max = Math.max(max,sum);
            }
            r++ ;
        } 
        return max ;
    }
}
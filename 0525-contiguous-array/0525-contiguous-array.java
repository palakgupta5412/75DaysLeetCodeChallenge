class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length ;
        int max = 0 ;
        Map<Integer,Integer> map = new HashMap<>();   //storing sum,firstIndex
        int sum = 0;
        map.put(0,-1);

        for(int i=0 ; i<n ; i++){
            if(nums[i]==0){
                nums[i]=-1;
                sum-=1;
            }else{
                sum+=nums[i];
            }
            if(map.containsKey(sum)){
                int len = i-map.get(sum);
                max = Math.max(max,len);
            }else{
                map.put(sum,i);
            }
        }
        return max ;
    }
}
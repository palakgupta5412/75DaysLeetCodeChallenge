class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        } 

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int num : map.keySet()){
            pq.add(new int[]{num,map.get(num)});
        }

        for(int i=0 ; i<k ; i++){
            ans[i] = pq.poll()[0];
        }
        return ans ;
    }
}
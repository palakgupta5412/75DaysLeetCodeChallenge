class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = numbers.length ;
        for(int i=0 ; i<n ; i++){
            int num = numbers[i];
            if(map.containsKey(target-num)){
                return new int[]{map.get(target-num)+1,i+1};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}
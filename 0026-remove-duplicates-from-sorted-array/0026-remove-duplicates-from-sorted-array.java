class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0 ;
        int n = nums.length ;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(list.contains(nums[i])){
                continue;
            }
            else{
                list.add(nums[i]);
                k++;
            }
        }   
        Collections.sort(list);
        for(int i=0 ; i<k ; i++){
            nums[i]=list.get(i);
        }
        return k ;
    }
}
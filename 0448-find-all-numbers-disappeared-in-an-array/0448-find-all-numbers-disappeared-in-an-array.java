class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length ;
        if(n==0){
            return new ArrayList<>();
        }

        if(n==1){
            if(nums[0]==1){
                return new ArrayList<>();
            }else{
                return new ArrayList<>(1);
            }
        }
        int i=0 ;
        while(i<n){
            int correctIdx = nums[i]-1;
            
            if(nums[i]!=nums[correctIdx]){
                int temp = nums[correctIdx];
                nums[correctIdx]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }

            // [2,3,1,4]
            // [2,3,2,1]
            // [3,2,2,1]
            // [1,2,2,3]
        }
        for(int j=0 ; j<n ; j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans ;
    }
}
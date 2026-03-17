class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[9];
        for(int i=1 ; i<=9 ; i++){
            nums[i-1]=i;
        }   

        List<List<Integer>> ans = new ArrayList<>();
        // n is the sum , k is the length
        fn(ans,new ArrayList<>(), nums , 0 , n , k);
        return ans ;
    }

    public void fn(List<List<Integer>> ans , List<Integer> temp , int[] nums , int idx , int sum , int k ){

        if(temp.size()==k && sum==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        if(idx>=nums.length){
            return ;
        }

        temp.add(nums[idx]);
        fn(ans,temp,nums,idx+1,sum-nums[idx],k);
        temp.remove(temp.size()-1);
        fn(ans,temp,nums,idx+1,sum,k);
    }
}
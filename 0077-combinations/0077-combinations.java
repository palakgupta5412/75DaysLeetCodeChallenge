class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i=1 ; i<=n ; i++){
            nums[i-1]=i;
        }

        List<List<Integer>> ans = new ArrayList<>();
        fn(ans,new ArrayList<>(),nums,0,n,k);
        return ans ; 
    }

    public void fn(List<List<Integer>> ans ,List<Integer> temp, int[] nums , int idx , int n,int k){

        if(temp.size()==k ){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        if(idx>=n){
            return ;
        }

        temp.add(nums[idx]);
        fn(ans,temp,nums,idx+1,n,k);
        temp.remove(temp.size()-1);
        fn(ans,temp,nums,idx+1,n,k);

    }
}
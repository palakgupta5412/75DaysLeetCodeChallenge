class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        fn(ans,temp,nums,map);
        return ans;
    }

    public void fn(List<List<Integer>> ans , List<Integer> temp , int[] nums , boolean[] map){


        //Base Case :
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0 ; i<nums.length ; i++){
            if(!map[i]){
                temp.add(nums[i]);
                map[i]=true ;
                fn(ans,temp,nums,map);
                temp.remove(temp.size()-1);
                map[i]=false;
            }

        }
    }
}
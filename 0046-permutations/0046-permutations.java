class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] visited = new int[nums.length];
        fn(ans,new ArrayList<>(),0,visited,nums);
        return ans ;
    }

    public void fn(List<List<Integer>> ans , List<Integer> temp, int idx , int[] visited,int[] nums){
        if(temp.size()==nums.length){
            if(!ans.contains(temp)){
                ans.add(new ArrayList<>(temp));
                return ;
            }
        }

        if(idx>=nums.length){
            return ;
        }

        for(int i=0 ; i<nums.length ; i++){
            if(visited[i]==0){
                temp.add(nums[i]);
                visited[i]=1;
                fn(ans,temp,idx+1,visited,nums);
                temp.remove(temp.size()-1);
                visited[i]=0 ;
            }
        }
    }
}
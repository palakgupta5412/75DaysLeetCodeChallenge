class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ; 
        int[] ans = new int[n];

        Stack<Integer> stck = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            if(stck.isEmpty()){
                ans[i]=0 ;
                stck.push(i);
                continue ;
            }
            else{
                while(!stck.isEmpty() && temp[stck.peek()]<=temp[i]){
                    stck.pop();
                }
                if(stck.isEmpty()){
                    ans[i]=0;
                }else{
                    ans[i] = stck.peek()-i ;
                }
                stck.push(i);
            }
        }
        return ans ;
    }
}
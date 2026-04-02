class Pair{
    int first , second ;

    Pair(int f , int s ){
        this.first =  f ;
        this.second = s ;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ; 
        int[] ans = new int[n];

        Stack<Pair> stck = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            if(stck.isEmpty()){
                ans[i]=0 ;
                stck.push(new Pair(temp[i],i));
                continue ;
            }
            else{
                while(!stck.isEmpty() && stck.peek().first<=temp[i]){
                    stck.pop();
                }
                if(stck.isEmpty()){
                    ans[i]=0;
                }else{
                    ans[i] = stck.peek().second-i ;
                }
                stck.push(new Pair(temp[i],i));
            }
        }
        return ans ;
    }
}
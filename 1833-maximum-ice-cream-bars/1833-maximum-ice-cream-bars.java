class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length ;
        
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(costs[i]>max){
                max = costs[i];
            }
        }

        int[] count = new int[max+1];
        for(int i=0; i<n ; i++){
            count[costs[i]]++ ;
        }

        int ans = 0 ;
        int i=0 ;
        while(i<count.length){
            if(count[i]>0){
                if(coins>=i){
                    count[i]--;
                    ans++ ;
                    coins-=i ;
                }
                else{
                    return ans ;
                }
            }
            else{
                i++ ;
            }
        }
        return ans ;
    }
}
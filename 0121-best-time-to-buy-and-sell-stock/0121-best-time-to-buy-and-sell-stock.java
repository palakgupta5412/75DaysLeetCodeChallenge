class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int n = prices.length ;
        int[] dp = new int[n];

        for(int i=0 ; i<n ;i++){
            dp[i]=-1 ;
        }
        int min = Integer.MAX_VALUE ;
        for(int i=0 ; i<n ; i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                profit = Math.max(profit , prices[i]-min);
            }
        }

        return profit ;
    }
}
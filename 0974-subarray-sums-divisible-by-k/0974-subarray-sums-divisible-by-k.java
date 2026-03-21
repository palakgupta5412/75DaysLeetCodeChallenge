class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        //Since dividing by k therefore only remainders possible are from 0 to k-1
        int[] map = new int[k];     //we will store remainders here 

        //Base case , rem=0 enccountered once before iterating array 
        map[0]=1;

        int count = 0 ;
        int sum = 0 ;
        int n = nums.length ;

        for(int i=0 ; i<n ; i++){
            sum+=nums[i];

            int rem = sum%k ;
            if(rem<0){
                rem+=k ;
            }
            count+=map[rem];

            map[rem]++;
        }
        return count ;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0 ;
        int count = 0 ;

        Arrays.sort(boxTypes , (a,b)->Integer.compare(b[1],a[1]));

        for(int[] arr : boxTypes){
            if(count + arr[0] <= truckSize){
                ans+=(arr[0]*arr[1]);
                count += arr[0];
            }else{
                int left = truckSize-count ;
                ans+= left*arr[1];
                return ans ;
            }
        }
        return ans ;
    }
}
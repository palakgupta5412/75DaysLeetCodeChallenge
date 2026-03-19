class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length ;
        int[] highway = new int[1001];
        for(int[] trip : trips){
            int num = trip[0];
            highway[trip[1]]+=num ;
            highway[trip[2]]-=num ;
        }
        int curr = 0 ;
        for(int i=0 ; i<1001 ; i++){
            if(highway[i]>0){
                curr+=highway[i];
                if(curr>capacity){
                    return false;
                }
            }else{
                curr+=highway[i];
            }
        }
        return true ;
    }
}
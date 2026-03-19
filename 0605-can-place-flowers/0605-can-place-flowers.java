class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length ;
        if(n==0){
            return true ;
        }
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                return n<=1 ;
            }else{
                return n==0 ;
            }
        }
        for(int i=0 ; i<flowerbed.length ; i++){
            if(i==0 && i+1<len){
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[0]=1;
                    n--;
                }else{
                    continue;
                }
            }
            if(i==flowerbed.length-1 && i-1>=0){
                if(flowerbed[i]+flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    n--;
                }
            }
            if(i>0 && i<len-1 && flowerbed[i]+flowerbed[i+1]+flowerbed[i-1]==0){
                flowerbed[i]=1 ;
                n-- ;
            }
            if(n==0){
                return true ;
            }
        }
        return false;
    }
}
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int ans1 = 0 ; 
        int ans2 = 0 ;

        //Finding longest substring with atmost k F's gives ans1 
        //Finding longest substring with atmost k T's gives ans2 
        //Final ans is max(ans1,ans2);
        
        int n = answerKey.length();

        //Finding ans1 
        int l = 0 ;
        int r = 0 ;

        int maxLen = 0 ;
        int fs = 0 ;

        while(r<n){
            if(answerKey.charAt(r)=='F'){
                fs++;
            }
            while(fs>k){
                if(answerKey.charAt(l)=='F'){
                    fs--;
                }
                l++;
            }

            maxLen = Math.max(r-l+1,maxLen);
            r++ ;
        }

        ans1 = maxLen ;

        //Finding ans2 
        l = 0 ;
        r = 0 ;

        maxLen = 0 ;
        int ts = 0 ;

        while(r<n){
            if(answerKey.charAt(r)=='T'){
                ts++;
            }
            while(ts>k){
                if(answerKey.charAt(l)=='T'){
                    ts--;
                }
                l++;
            }

            maxLen = Math.max(r-l+1,maxLen);
            r++ ;
        }

        ans2 = maxLen ;
        return Math.max(ans1,ans2);

    }
}
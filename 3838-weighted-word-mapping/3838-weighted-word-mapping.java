class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "" ;
        int len = words.length ;

        for(int i=0; i<len; i++){
            String word = words[i] ;
            int curr = 0 ;
            for(int j=0 ; j<word.length() ; j++){
                curr+=weights[word.charAt(j)-'a'];
            }
            curr = curr%26 ;
            char ch = (char)('z'-curr) ;
            ans+=ch;
        }
        return ans ;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();

        if(slen!=tlen){
            return false ;
        }
        int[] count = new int[26];

        for(int i=0 ; i<slen ; i++){
            count[s.charAt(i)-'a']++;
        }

        for(int i=0 ; i<tlen ; i++){
            if(count[t.charAt(i)-'a']==0){
                return false;
            }
            count[t.charAt(i)-'a']--;
        }
        return true ;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n>m) return false ;

        int[] freq = new int[26];

        for(int i=0 ; i<n ; i++){
            freq[s1.charAt(i)-'a']++;
        }

        int l=0 ;
        int r=0 ;
        int count = 0 ;

        while(r<m){
            char ch = s2.charAt(r);

            if(freq[ch-'a']>0){
                count++;
            }
            freq[ch - 'a']--;

            if(r-l+1 > n){
                freq[s2.charAt(l)-'a']++;

                if (freq[s2.charAt(l) - 'a'] > 0) {
                    count--;
                }
                l++;
            }
            if(r-l+1 == n){
                if (count==n) return true ; 
            }
            r++ ;
        }
        return false ;
    }
}
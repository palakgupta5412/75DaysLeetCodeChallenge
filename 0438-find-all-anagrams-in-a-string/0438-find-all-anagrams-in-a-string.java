class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int lenS = s.length();
        int lenP = p.length();

        int l = 0 ;
        int r = 0 ;

        int[] freq = new int[26];
        for(int i=0 ; i<lenP ; i++){
            freq[p.charAt(i)-'a']++;
        }
        int count = 0 ;
        while(r<lenS){
            char ch = s.charAt(r);
            if(freq[ch-'a']>0){
                count++ ;
            }
            
            freq[ch-'a']--;

            if(r-l+1 > lenP){
                freq[s.charAt(l)-'a']++;

                if(freq[s.charAt(l)-'a']>0){
                    count-- ;
                }
                l++;
            }
            if(r-l+1==lenP && count==lenP ){
                ans.add(l);
            }
            r++ ;
        }
        return ans ;
    }
}
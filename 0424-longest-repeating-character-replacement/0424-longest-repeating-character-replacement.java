class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int l=0 ;
        int r=0 ;
        int ans = 0 ;
        int freq = 0 ;
        Map<Character,Integer> map = new HashMap<>();
        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq = Math.max(freq,map.get(ch));

            int changeable = (r-l+1)-freq ;
            if(changeable<=k){
                ans = Math.max(ans,r-l+1);
            }else{
                char c = s.charAt(l) ;
                int val = map.get(c);
                map.put(c,val-1);

                if(val-1==0){
                    map.remove(c);
                }
                l++;
            }
            r++;
        }

        return ans ;
    }
}
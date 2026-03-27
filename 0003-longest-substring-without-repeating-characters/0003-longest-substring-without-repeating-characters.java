class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0 ;
        int right = 0 ; 
        int n = s.length() ;
        int len = Integer.MIN_VALUE ;
        if(n==0){
            return 0 ;
        }
        while(right<n){
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch)>=left){
                left = map.get(ch)+1 ;
            }
            len = Math.max(len,right-left+1);
            map.put(ch,right);
            right++ ;
        }
        return len==Integer.MIN_VALUE? 0 : len ;
    }
}
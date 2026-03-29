class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');

        Stack<Character> stck = new Stack<>();
        int n = s.length() ;
        if(n%2!=0){
            return false;
        }
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stck.push(ch);
            }else {
                if(stck.isEmpty()){
                    return false ;
                }
                char popped = stck.pop();
                if(mp.get(ch)!=popped){
                    return false ;
                }
            }
        }
        return stck.isEmpty() ;
    }
}
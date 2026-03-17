class Solution {
    public List<String> letterCombinations(String digits) {
        
        int k = digits.length() ;
        List<String> ans = new ArrayList<>();
        fn(ans,"",0,digits,k);
        return ans ;
    }

    public void fn(List<String> ans,String temp,int idx,String digits,int k){

        if(temp.length()==k){
            ans.add(temp);
            temp="" ;
            return ;
        }

        if(idx>=digits.length()){
            return ;
        }

        String str = get(digits.charAt(idx));
        for(Character ch : str.toCharArray()){
            fn(ans,temp+ch,idx+1,digits,k);
        }
    }
    public String get(char num){
        if(num=='2'){
            return "abc"; 
        }else if(num=='3'){
            return "def";
        }else if(num=='4'){
            return "ghi";
        }else if(num=='5'){
            return "jkl";
        }else if(num=='6'){
            return "mno";
        }else if(num=='7'){
            return "pqrs";
        }else if(num=='8'){
            return "tuv";
        }else{ 
            return "wxyz";
        }
    }
}
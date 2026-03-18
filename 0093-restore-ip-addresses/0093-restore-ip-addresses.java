class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        fn(ans,new ArrayList<>() , 0 , s);
        return ans ;
    }

    public void fn(List<String> ans, List<String> temp, int idx , String s){

        if(temp.size()==4 && idx==s.length()){
            String str = String.join(".",temp);
            ans.add(str);
            return ;
        }

        if(temp.size()==4 || idx>=s.length()){
            return ;
        }

        for(int i=idx ; i<idx+3 && i<s.length() ; i++){
            String slice = s.substring(idx,i+1);
            if(isValid(slice)){
                temp.add(slice);
                fn(ans,temp,i+1,s);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean isValid(String slice){
        if(slice.length()>3 || slice.length()==0){
            return false ;
        }

        if(Integer.parseInt(slice)>255){
            return false ;
        }

        int len = slice.length();
        if(len>1 && slice.charAt(0)=='0'){
            return false ;
        }
        return true ;
    }
}
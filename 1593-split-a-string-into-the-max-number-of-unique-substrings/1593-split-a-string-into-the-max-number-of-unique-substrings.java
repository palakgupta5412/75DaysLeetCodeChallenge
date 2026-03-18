class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> done = new HashSet<>();
        return fn(s,done,0);
    }

    public int fn(String s, HashSet<String> done , int idx){
        if(idx==s.length()){
            return 0;
        }

        int maxSplit = 0 ;
        for(int i=idx ; i<s.length() ; i++){
            String slice = s.substring(idx,i+1);
            if(!done.contains(slice)){
                done.add(slice);
                int currSplits=1+fn(s,done,i+1);
                maxSplit = Math.max(currSplits,maxSplit);
                done.remove(slice);
            }
        }
        return maxSplit;
    }
}
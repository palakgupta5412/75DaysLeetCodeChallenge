class Solution {
    public int numTilePossibilities(String tiles) {
        int[] frq = new int[26];
        for(char ch : tiles.toCharArray()){
            frq[ch-'A']++;
        }
        return fn(frq);
    }

    public int fn(int[] freq){
        int count = 0 ;
        for(int i=0 ; i<26 ; i++){
            if(freq[i]>0){
                count++;
                freq[i]--;
                count+=fn(freq);

                freq[i]++;
            }
        }
        return count ;
    }
}
class Pair{
    String first ;
    Integer second ; 

    public Pair(String w , Integer count){
        this.first = w ;
        this.second = count ;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> {
            if (!a.second.equals(b.second)) {
                return Integer.compare(b.second, a.second);
            }
            // If counts are equal, smaller string comes first (Alphabetical/Ascending)
            return a.first.compareTo(b.first);
        }) ;
        int n = words.length ;
        for(int i=0 ; i<n ; i++){
            int val = map.getOrDefault(words[i],0);
            map.put(words[i],val+1);
        }

        for(String word : map.keySet()){
            pq.add(new Pair(word,map.get(word)));
        }

        for(int i=0 ; i<k ; i++){
            ans.add(pq.poll().first);
        }
        // Collections.sort(ans) ;
        return ans ;
    }
}
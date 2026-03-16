class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String s = new String(chArr);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                map.put(s,new ArrayList<>());
                map.get(s).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
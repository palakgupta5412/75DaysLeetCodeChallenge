class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if (a[0] == b[0]) {
                return a[1] - b[1]; // Same height? Sort ascending by 'k'
            } else {
                return b[0] - a[0]; // Different height? Sort descending by height
            }
        });
        List<int[]> list = new ArrayList<>();
        for(int[] p : people){
            int ht = p[0];
            int idx = p[1];

            list.add(idx,p);
        }

        return list.toArray(new int[people.length][]);
    }
}
class Solution {
    int count = 0 ;
    public int countArrangement(int n) {

        int[] visited = new int[n+1];
        fn(visited,1,n);
        return count;
    }

    public void fn(int[] visited, int idx , int n){
        if(idx>n){
            count++;
            return ;
        }
        for(int i=1 ; i<=n ; i++){
            if(visited[i]==0 && (idx%i==0 || i%idx==0)){
                visited[i]=1;
                fn(visited,idx+1,n);
                visited[i]=0 ;
            }
        }
    }
}
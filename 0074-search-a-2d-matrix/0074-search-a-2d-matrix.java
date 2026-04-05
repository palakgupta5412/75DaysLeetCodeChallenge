class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0 ;
        int n = matrix[0].length -1 ;

        while( m <= matrix.length-1  &&  n>=0  ){
            if(matrix[m][n] == target){
                return true ;
            }
            if(matrix[m][n]<target){
                m++;
            }
            else{
                n-- ;
            }
        }

        return false ;
    }
}
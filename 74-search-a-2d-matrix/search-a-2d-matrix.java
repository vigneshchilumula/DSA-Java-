class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l =0 ; int r = m*n -1 ;
        while(l<=r){
            int mid = l + (r-l)/2;
            int row = mid/m;
            int column = mid%m;
            if(matrix[row][column]== target){
                return true ;
            }
            else if ( matrix[row][column]< target){
                l = mid+1;
            }
            else r = mid-1;
        }
        return false;
    }
}
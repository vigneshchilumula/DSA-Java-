class Solution {
    private void findcombination( int i , int[] arr , int target , int n ,List<List<Integer>> ans ,  List<Integer>ds  ){
        if ( i==n){
            if ( target == 0 ){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i] <= target ){
            ds.add(arr[i]);
            findcombination( i , arr , target - arr[i] , n , ans, ds);
            ds.remove(ds.size() - 1);
           
        }
         findcombination(i + 1 , arr , target , n  , ans , ds );
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        findcombination(0 , candidates , target , n , ans , new ArrayList<>() );
        return ans ;
    }
}
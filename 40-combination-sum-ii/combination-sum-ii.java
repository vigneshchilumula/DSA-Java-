class Solution {
    private void Sum2(int ind , int[] arr , int target , List<List<Integer>> ans , List<Integer> ds){
        if ( target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for ( int i = ind ; i < arr.length ; i++){  
            if ( arr[i]> target){
                break;
            }
            if( i > ind && arr[i]== arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            Sum2( i +1 , arr , target - arr[i] , ans , ds );
            ds.remove(ds.size() - 1 );

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        Sum2(0 , candidates , target , ans , new ArrayList<>());
        return ans;

    }
}
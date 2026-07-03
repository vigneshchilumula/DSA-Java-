class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length; 
        List<List<Integer>> ans = new ArrayList<>();
        int subsets = 1<<n; 
        for(int number =0 ; number<subsets; number++){
            List<Integer> subset = new ArrayList<>();
            for(int i= 0 ; i<n ; i++){
                if((number&(1<<i))!=0  ){
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);
        }
        return ans;
    }
}
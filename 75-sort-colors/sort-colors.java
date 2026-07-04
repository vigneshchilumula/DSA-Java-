class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length; 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.getOrDefault(nums[i],0)+ 1);
            }
            else{
                hm.put(nums[i],1);
            }

        }
      
          
            int count0= hm.getOrDefault(0,0);
            int count1= hm.getOrDefault(1,0);
            int count2= hm.getOrDefault(2,0);
            for(int i = 0 ; i<count0; i++){
                nums[i]=0;
            }
            for(int i = count0 ; i<count0+count1; i++){
                nums[i]=1;
            }
            for(int i = count1+ count0 ; i<n; i++){
                nums[i]=2;
            }

        
        
    }
}
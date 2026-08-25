class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length; int l =0 ; int r =0;
        int maxlength = 0; 
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(r<n){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0) + 1 );
           
               
            while(hm.size()>2){
               hm.put(fruits[l],hm.getOrDefault(fruits[l],0) - 1);
             
                if (hm.get(fruits[l]) == 0) {
                    hm.remove(fruits[l]);
                }
                  l++;
            }
            int  length = r-l + 1 ;
                maxlength=Math.max(maxlength, length);
                r++;
            

        }

return maxlength;
    }
}
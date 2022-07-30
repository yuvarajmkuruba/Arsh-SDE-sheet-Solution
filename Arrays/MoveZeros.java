
class Solution {
    public void moveZeroes(int[] nums) {
      int k=nums.length-1;
        int i=0;
        while(i<=k){
            if(nums[i]==0){
                
                nums[k]=0;
            }
        }
    }
}
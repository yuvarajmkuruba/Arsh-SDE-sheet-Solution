package Arrays;

import java.util.Arrays;

public enum FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++){
              if(nums[Math.abs(nums[i])] < 0){
                  return Math.abs(nums[i]);
              }else {
                  nums[Math.abs(nums[i])] = nums[Math.abs(nums[i])] * -1;
              }
          }
          return -1;
      }
      
    //   public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1])return nums[i];
    //     }
    //     return -1;
    //   }
}

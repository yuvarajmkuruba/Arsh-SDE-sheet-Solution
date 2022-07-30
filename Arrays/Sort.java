package Arrays;
class Solution {
public void sortColors(int[] nums) {
    // Method 1
    //    Arrays.sort(nums); 


    // Method 2
    // int temp;
    // for (int i = 0; i <nums.length; i++) {
    //     for (int j = 0; j < nums.length; j++) {
    //         if(nums[i]<nums[j]){
    //             temp=nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //         }
    //     }
    // }

    // Method 3
    // Efficient Method
      int i=0,l=0,r=nums.length-1;
      while(i<=r){
        if(nums[i]==0){
            nums[i]=nums[l];
            nums[l]=0;
            i++;
            l++;
        }
        else if(nums[i]==2){
            nums[i]=nums[r];
            nums[r]=2;
            r--;
        }
        else{
            i++;
        }
      } 
    }
}

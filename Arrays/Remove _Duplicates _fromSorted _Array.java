class Solution {
    public int removeDuplicates(int[] nums) {
        int Index=0;
        for(int i=0; i < nums.length; i++)
            if(nums[i] != nums[Index])
                nums[++Index] = nums[i];
        return Index + 1;
    }
}
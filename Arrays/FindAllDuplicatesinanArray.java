class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> result = new ArrayList<Integer>();
       Arrays.sort(nums);
       for (int i = 0; i < nums.length-1; i++) {
          if(nums[i]==nums[i+1]){
            result.add(nums[i]);
          }
       }
       return result;
    }
}
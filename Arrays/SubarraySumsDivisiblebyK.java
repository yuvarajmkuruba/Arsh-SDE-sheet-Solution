class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int[] count = new int[k];
    int remSum = 0;
    int result = count[0];
    for(int n : nums){
        remSum += ((n % k) + k) % k;
        count[remSum % k]++;
    }
    for(int c : count){
        result += (c * ( c - 1)) /2;
    }
    return result;
    }
}
//Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int subArrayCount = 0;
        HashMap<Integer, Integer> arr_sums = new HashMap();
        arr_sums.put(0, 1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(arr_sums.containsKey(sum - k)){
                subArrayCount += arr_sums.get(sum - k);
            }

            arr_sums.put(sum, arr_sums.getOrDefault(sum, 0)+1);
        }
        return subArrayCount;
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        
        int[] target_Array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    target_Array[0] = i;
                    target_Array[1] = j;
                    return target_Array;
                }
            }
        }
        return new int[] {-1,-1};
    }
}
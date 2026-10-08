class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        int i0 = 0;
        int i1 = 0;

        for(int num : nums) {
            for(int num1 : nums) {
                if (num + num1 == target) {
                    output[0] = i0;
                    output[1] = i1;
                    break;
                }
                i0++;
            }
            i0 = 0;
            i1++;
        }

        return output; 
    }
}

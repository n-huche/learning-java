import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];

            if (map.containsKey(result)) {
                output[0] = map.get(result);
                output[1] = i;
                return output;
            }

            map.put(nums[i], i);
        }
        return output;
    }
}

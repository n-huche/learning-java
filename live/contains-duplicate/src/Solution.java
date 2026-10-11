import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* int[] distinctNums = Arrays.stream(nums)
            .distinct()
            .toArray();
        
        if (nums.length == distinctNums.length) {
            return false;
        }
        
        return true; */

        ArrayList<Integer> map = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) {
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());     
        return nums.length != set.size();
    }
}

class Solution20261011 {
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

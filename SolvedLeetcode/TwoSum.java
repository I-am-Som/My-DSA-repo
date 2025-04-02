import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i : nums) {
            hm.put(nums[i], i);
            
            if(hm.containsKey(target - nums[i])) {
                int[] res = {hm.get(nums[i]), hm.get(target - nums[i])};
                return res;
            }
        }
        return res;
    }
}

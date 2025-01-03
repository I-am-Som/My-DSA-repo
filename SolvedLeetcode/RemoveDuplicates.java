public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int prev = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] != prev) {
                prev = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
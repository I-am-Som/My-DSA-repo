public class MajorityElement {
        public int majorityElement(int[] nums) {
            
            int ele = 0;
            int count = 0;
            
            for (int i : nums) {
    
                if(i == ele) {
                    count++;
                } else if (count == 0) {
                    ele = i;
                    count = 1;
                } else {
                    count--;
                }
    
            }
    
            count = 0;
            for (int i : nums) {
                if (i == ele) {
                    count++;
                }
            }
                if (count >= nums.length/2) {
                    return ele;
                }
    
            return -1;
        }
    
}

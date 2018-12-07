public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;

        while(true){
            if(i + 1 >= nums.length){
                return nums[i];
            }
            else if(nums[i] != nums[i+1]){
                return nums[i];
            }
            if(i + 2 >= nums.length){
                return 0;
            }

            i += 2;
        }

    }
}

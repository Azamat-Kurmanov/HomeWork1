package homeWork;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int indx = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]<nums[i+1]){
                nums[indx] = nums[i+1];
                indx++;
            }
        }
        return indx;
    }
}

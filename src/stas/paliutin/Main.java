package stas.paliutin;

class Solution {
    public int removeDuplicates(int[] nums) {
        int buff;
        int length = 0;
        if (null != nums && nums.length > 0) {
            length = nums.length;
            buff = nums[0];
            for (int i = 1; i < nums.length; i++) {
                System.out.println(nums[i]);
                if (buff == nums[i]){
                    
                }
            }
        }
        return length;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int length = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

}

//Problem Description => https://leetcode.com/problems/jump-game-ii/description
class Solution {
    public static int jump(int[] nums) {
        int count = 0;
        int sum = 0;
        int current = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(sum < i + nums[i]) sum = i + nums[i];
            if(current == i){
                current = sum;
                count ++;
            }
        }
        return count;
    }
    public static void main(String args []){
        int nums[] = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println("The minimum number of jumps are : "+jump(nums));
    }
}

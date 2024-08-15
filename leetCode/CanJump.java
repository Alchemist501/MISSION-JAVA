class Solution {
    public static boolean canJump(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < i) return false;
            sum = Math.max(sum, i + nums[i]);
            if (sum >= nums.length - 1) return true;
        }
        return sum >= nums.length - 1;
    }
    public static void main(String args[]){
        int nums [] = {2,3,1,1,4};
        System.out.println("They are reachable = " + canJump(nums));
    }
}

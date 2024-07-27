class Solution {
    static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int leftProduct = 1;
        int rightProduct = 1;
        for (int i = 0; i < len; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
            
        }
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) { 
        int [] nums = {1,2,3,4};
        int [] result = productExceptSelf(nums);
        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}

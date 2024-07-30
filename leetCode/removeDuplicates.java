// Problem Description => https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
class Solutionx {
    static int removeDuplicates(int[] nums) {
        int index = 2;
        int size = nums.length;
        if (size < 3) return size;
        for(int i = 2; i< size; i++){
            if( nums[i] != nums[index-2]  && (index ++) != i)
                nums[index - 1] = nums[i];
        }
        return index;
    }
    public static void main(String args[]){
        int [] nums = {1,1,1,2,2,2};
        int res = removeDuplicates(nums);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
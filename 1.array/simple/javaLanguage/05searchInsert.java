package javaLanguage;

class SolutionsearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while (left<=right) {
            int mid = (right - left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        return left;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,7};
        int target = 5;
        System.out.println(new SolutionsearchInsert().searchInsert(nums,target));
    }
}
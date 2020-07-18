/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplication {
    public static int removeDulication(int[] arr){
        int i = 0;
        for(int j=1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    //The official version
    public static int removeDuplicates(int[] nums) {
        
        // Check for edge cases.
        if (nums == null) {
            return 0;
        }
        
        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        int writePointer = 1;
        // Go through each element in the Array.
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++;
            }
        }
        
        // This turns out to be the correct length value.
        return writePointer;
      }
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3,4,5,6,6};
        int len = removeDuplicates(arr);
        for(int i = 0; i < len; i++){
            System.out.println(arr[i]);
        }
    }
}
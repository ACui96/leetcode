public class RemoveDuplictasFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int i = 0;
        if(nums.length <= 0)
            return 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,3,4,5,6,7,8,8,9};
        int length = removeDuplicates(arr);
        printArray(arr, length);
    }
    public static void printArray(int[] arr, int length){
        System.out.println("Length of arr is: " + length);
        for(int i = 0; i < length; i++){
            
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}
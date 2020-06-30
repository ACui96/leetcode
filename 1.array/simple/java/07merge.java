/**
 * 88. 合并两个有序数组
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

 

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 

示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 */
class mergeSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //p1 p2 分别指向 nums1 和 nums2 的末尾，p 指向待输出数组的末尾
        int p1 = m -1 ,p2 = n-1, p = m + n -1;
        //条件为两个数组中都还有数
        while((p1 >= 0) && (p2 >=0)){
            //将 nums1 末尾更改为两者中较大的，并自减一， 且较大的数对应的指针自减一
            nums1[p--] = nums1[p1] > nums2[p2] ? nums2[p2--] : nums1[p1--];
        }
        //把 nums2 中缺失的数补充到 nums1,如果还有得话
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }
}
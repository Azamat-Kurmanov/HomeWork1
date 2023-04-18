package homeWork;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        System.out.println("nums1: " + nums1.length);
        int m = 3;
        int[] nums2 = {2,5,6};
        System.out.println("nums2: " + nums2.length);
        int n = 3;
        merge(nums1, m, nums2, n);
    }
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        System.out.println("arr: " + Arrays.toString(arr));
        int i,j,k;
        i = m-1;
        j = n-1;
        k = nums1.length-1;
        while (j>=0){
            System.out.println("j: " + j);
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

       /* for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
            if (a >= 0 && nums1[a] > nums2[b]) nums1[i] = nums1[a--];
            else nums1[i] = nums2[b--];
        }*/

        System.out.println("nums1: " + Arrays.toString(nums1));
    }
}

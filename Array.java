import java.util.Arrays;

public  class Array{
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int temp[] = new int[len];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        //  now we got an array (temp) which is merged form of the two sorted array nums1 and nums2 and it is sorted also we have to find median;

        double median;
        int mid = (len - 1) / 2;
        if (len % 2 == 0) { // if the length is even we have to take the avg of both the middle values and find the answer

            median = (double) (temp[mid] + temp[mid + 1]) / 2;
        } else { // if the length of the resultant array is odd then the middle number will be the median of it
            return median = temp[mid];
        }


        return median;

//
//        // Ensure nums1 is the smaller array for efficiency
//        if (nums1.length > nums2.length) {
//            return findMedianSortedArrays(nums2, nums1);
//        }
//
//        int m = nums1.length;
//        int n = nums2.length;
//        int totalLeft = (m + n + 1) / 2;  // Total number of elements on the left side
//
//        int left = 0, right = m;
//
//        while (left <= right) {
//            int partition1 = left + (right - left) / 2;
//            int partition2 = totalLeft - partition1;
//
//            // Elements immediately to the left and right of the partition
//            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
//            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
//
//            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
//            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
//
//            // Check if we have a valid partition
//            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
//                // If the total number of elements is odd, return the max of left side
//                if ((m + n) % 2 == 1) {
//                    return Math.max(maxLeft1, maxLeft2);
//                }
//                // If even, return the average of max of left side and min of right side
//                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
//            }
//            // Adjust the binary search range
//            else if (maxLeft1 > minRight2) {
//                right = partition1 - 1;  // Move to the left in nums1
//            } else {
//                left = partition1 + 1;  // Move to the right in nums1
//            }
//        }
//
//        throw new IllegalArgumentException("Input arrays are not sorted.");
//    }

    }
    public static int maxArea(int[] height) {
        int left;
        int area = 0;
        int maxarea = 0;
//  brute force approach having O(n2) complexity because we are considering each and every possible pair in it
        for (left = 0; left < height.length; left++) {
            int right = height.length - 1;
            while (right > left) {
                area = Math.min(height[left], height[right]) * (right - left);
                if (maxarea <= area) {
                    maxarea = area;
                }
                right--;
            }
        }
        return maxarea;

        // linear approach using two pointer method O(n) complexity in this our main focus is to maximize the area by increasing area and reducing the width(because we already calculated the area for the maximum width condition in first iteration and then we try to compare the area by taking case of maximum hiegth also and then returning the maximum  area )


//    }
//            int left=0;
//            int area=0;
//            int maxarea=0;
//            int right= height.length-1;
//            while(right>left){
//                area=Math.min(height[left],height[right])*(right-left);
//                maxarea = Math.max(maxarea, area);
//                if (height[left] < height[right]) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//
//            return maxarea;

    }
    public static int removeElement(int [] nums ,int val){
//
        int index = 0; // This will track the position of non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Move non-val element to the 'index' position
                nums[index] = nums[i];
                index++; // Increment the index
            }
        }

        return index; // The value of index is the number of non-val elements
    }

   public static void main(String[] args) {
//        int nums1[]={1,2};
//        int nums2[]={3,4};
//        System.out.println(findMedianSortedArrays(nums1,nums2));
//
//        int arr[]={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(arr));
 int [] nums= {3,2,2,3};
 int val=3;

       System.out.println(removeElement(nums,val));
       System.out.print(Arrays.toString(nums));

    }
}
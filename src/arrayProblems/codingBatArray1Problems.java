package arrayProblems;

public class codingBatArray1Problems {
    /*
Given 2 arrays of ints, a and b, return true if they have
the same first element or they have the same last element.
Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
*/
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
            return true;
        } else return false;
    }
    /*
Given an array of ints, return true if 6 appears as either the first
 or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/
    public boolean firstLast6(int [] nums) {
        // find last element index
        int lastElement = nums.length - 1;
        // evaluate
        if (nums[0] == 6 || nums[lastElement] == 6 ) {
            return true;
        } else return false;
    }
// check which start w 1
    public int start1(int[] a, int[] b) {
        int count = 0;
        // iterate over 1st element separately
        // ensure no runtime error by checking if [] length > 0
        if (a.length > 0) {
            if (a[0] == 1) {
                count += 1;
            }
        }
        if (b.length > 0) {
            if (b[0] == 1) {
                count += 1;
            }
        }
        return count;
    }
    /*
Given an array of ints length 3, figure out which is larger,
 the first or last element in the array, and set all the other
  elements to be that value. Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3] */
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            int i = nums[0];
            int[] updatedNums = new int[] {i,i,i};
            return updatedNums;
        } else if (nums[2] > nums[0]) {
            int i = nums[2];
            int[] updatedNums = new int[] {i,i,i};
            return updatedNums;
        } else if (nums[0] == nums[2]) {
            int i = nums[2];
            int[] numsUpdated = new int[] {i,i,i};
            return numsUpdated;
        }
        return nums;
    }
    /* Given an array of ints, return true if every 2 that appears in the array is next to another 2.
twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/
    public boolean twoTwo(int[] nums) {
        boolean hasNeighbor = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                // check for neighbor
                if (nums[i + 1] == 2) {
                    hasNeighbor = true;
                }
            }
            return hasNeighbor;
    }

}

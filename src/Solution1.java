public class Solution1 {
    /**

     * https://leetcode.com/problems/valid-perfect-square/
     */
    public boolean isPerfectSquare(int num) {

        long start = 1;
        long end = num;

        while (start + 1 < end) {
            long mid = (start + end) / 2;
            if (mid * mid == num) return true;

            if (mid * mid <= num) {
                start = mid;
            } else end = mid;
        }
        return start * start == num ? true : false;
    }

    //....................................................................
    //https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (target > nums[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return end + 1;
    }

    //.............................................................
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;



        for( char a :letters ){
            if (a> target) return a;

        }
        return letters[0];
    }

}
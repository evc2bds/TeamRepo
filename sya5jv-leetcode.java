// sya5jv-leetcode.java
// Samuel Ahn, sya5jv, 09/29/2021

class Solution {
    public int[] runningSum(int[] nums) {
        
        // Finding the size of the array
        int sizeOfArray = nums.length;
        int[] answerArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            if (i == 0) {
                answerArray[i] = nums[i];
            } else {
                answerArray[i] = answerArray[i - 1] + nums[i];
            }
        }

        return answerArray;
    }
}
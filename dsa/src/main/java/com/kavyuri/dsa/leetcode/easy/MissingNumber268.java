package com.kavyuri.dsa.leetcode.easy;

public class MissingNumber268 {

    // O(N) & O(1) - cummulative property {x xor 0 = x } and { x xor x = 0 }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int XOR = 0;
        for (int i = 0; i <= n; i++) {
            XOR = XOR ^ i;
        }

        for (int num : nums) {
            XOR = XOR ^ num;
        }

        return XOR;

    }

}

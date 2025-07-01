package org.java.challenge;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    /*
       Beginner Level -
        First Challenge - Remove Duplicate from List
        return a list with duplicates removed, preserving original order.
        Input: [1, 2, 2, 3, 1]
        Output: [1, 2, 3]
        Second Challenge - Count Character Frequency
        Return a map with the count of each character in the string.
        Input: "banana"
        Output: {b=1, a=3, n=2}
     */
    public static void main(String[] args) {
       List<Integer> nums = new ArrayList<>();
       nums = List.of(1,2,2,3,1);
        System.out.println(removeDuplicates(nums));
    }

    static List<Integer> removeDuplicates(List<Integer> nums) {
        return nums.stream().distinct().toList();
    }

}

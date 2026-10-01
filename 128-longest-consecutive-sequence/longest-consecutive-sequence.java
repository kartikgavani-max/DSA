import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        } 

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int currentnum = num;
                int currentlength = 1;

                while(set.contains(currentnum+1)){
                    currentnum++;
                    currentlength++;
                }

                longest = Math.max(longest , currentlength);
            }
        }
        return longest;
    }
}
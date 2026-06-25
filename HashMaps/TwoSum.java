/*
Given an array of integers and an integer target, return indices of the two numbers such that they add upto target. You may assume that every input will have exactly one solution, and you may not use the same element twice.
*/
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println(map.get(complement) + " " + i);
                break;
            }

            map.put(arr[i], i);
        }

    }
}

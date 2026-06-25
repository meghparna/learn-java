/*
Given an array of size n, find the element that appears more than n/2 times.
*/
import java.util.HashMap;

public class MajorityElement {
    public static int checkMajority(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        for(Integer key: freq.keySet()){
            if(freq.get(key) > arr.length/2){
                return key;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,3,2};
        System.out.println(checkMajority(arr));
    }
}

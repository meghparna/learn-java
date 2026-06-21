//Find Duplicates in an Array

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,4,5,1};

        HashMap<Integer, Integer> freq = new HashMap<>(); 

        for(int num: arr){

            if(freq.containsKey(num)){
                System.out.println("Duplicate: " + num);
            }
            else{
                freq.put(num, 1);
            }

        }
    }
}

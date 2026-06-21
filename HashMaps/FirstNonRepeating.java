//First Non-Repeating Element in array

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0) +  1);
        }

        boolean found = false;

        for(int num: arr){
            if(freq.get(num) == 1){
                found = true;
                System.out.println("First non repeating element: " + num);
                break;
            }
        }

        if(!found){
            System.out.println("No non repeating element found");
        }

    }
}

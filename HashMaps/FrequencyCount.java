//Count frequency of elements in an array

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        System.out.println("Frequency of elements: ");

        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
    }
}

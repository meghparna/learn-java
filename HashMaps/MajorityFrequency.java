//Find the element occurring most frequently.
import java.util.HashMap;
import java.util.Scanner;

public class MajorityFrequency {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0 ) +1);
        }

        int max_element = -1;
        int max_freq = 0;
       
        for(Integer key: freq.keySet()){
            if(freq.get(key) > max_freq){
                max_freq = freq.get(key);
                max_element = key;
            }
        }

        System.out.println("Max frequency element: " + max_element + " -> " + max_freq);
    }
   

}

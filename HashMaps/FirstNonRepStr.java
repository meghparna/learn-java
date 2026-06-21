//First Non-Repeating Character in string
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        char[] arr = str.toCharArray();

        for(char letter : arr){
            freq.put(letter, freq.getOrDefault(letter,0) +1);
        }

        for(char letter : arr){
            if(freq.get(letter) == 1){
                System.out.println("First Non Repeating Character: " + letter);
                break;
            }
        }
    }
}

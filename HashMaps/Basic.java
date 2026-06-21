import java.util.HashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"namrata");
        myMap.put(2, "akash");

        System.out.println(myMap);
        System.out.println(myMap.get(1));
        System.out.println(myMap.containsKey(2));
        System.out.println(myMap.getOrDefault(3,  "not present"));

        //entrySet -> returns all key value pairs
        //Map.Entry -> represents one key- value pair
        //for each loop 
        for(Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println("Key -> " + entry.getKey());
            System.out.println("Value ->" + entry.getValue());
        }

        //iterate over keys only
        for(Integer key: myMap.keySet()){
            System.out.println(key);
        }

        //iterate over only values
        for(String value: myMap.values()){
            System.out.println(value);
        }

        /*
        Traversal patterns:
        1---

        for(Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        2---

        for(Integer key : myMap.keySet()){
            System.out.println(key+ " " +myMap.get(key));
        }
        
        3---

        myMap.forEach((key,value) ->
            System.out.println(key + " " +value);
        );
        */

        /*
        HashMap methods:

        myMap.remove(2);
        myMap.replace(1, "Shreyanshi");
        System.out.println(myMap.size());
        System.out.println(myMap.isEmpty());

        */
    }    
}

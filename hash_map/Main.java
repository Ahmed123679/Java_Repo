package hash_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> func = new HashMap<>();
        
        func.put("Ahmed", 1);
        func.put("Mohamed", 2);
        func.put("Ali", 3);
        func.put("Yasser", 4);
        
        // printing hash map values
        for(String key : func.keySet())
        {

            System.out.println(key + ": " + func.get(key));
        }
        func.remove("Ahmed");
        // another method
        for(Map.Entry<String,Integer> entry : func.entrySet())
        {
            System.out.println(entry);
        }
        func.forEach((K,V) -> System.out.print("Key:" + K + " Value = " + V));
    }
}

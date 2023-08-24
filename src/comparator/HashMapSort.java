package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSort {

    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();


        map.put("Guru", 78);
        map.put("Dhanu", 100);
        map.put("Satish", 43);
       
        map.put("Shweta", 76);

        List<String> keys = new ArrayList<>(map.keySet());

        Collections.sort(keys);
        System.out.println(keys);
    }

    
   
    
}

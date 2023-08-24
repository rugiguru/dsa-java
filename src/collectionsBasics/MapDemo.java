package collectionsBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        

        Map<String, Integer> map = new HashMap<>();

        map.put("guru", 5);
        map.put("dhanu", 1);
        map.put("shikhar", 2);

        // System.out.println(map.getOrDefault("guru", 10));

        // iterating over map
        // as map doe not im plements the Iterable interface as the collection does
        // we have Entry interface for iterating through the maps
       Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

       for(Map.Entry<String, Integer> entry : entrySet){
           System.out.println(entry.getKey() + ", " + entry.getValue()); 
       }

       // we can even get only key sets 

       Set<String> keys =  map.keySet();

       for(String key : keys){
           System.out.println(key + ", " + map.get(key));
       }

        // One more scenario where the key is Integer and value is List<Integer>

        Map<Integer, List<Integer>> custom = new HashMap<>();

        custom.computeIfAbsent(1, f -> new ArrayList<>()).add(10);

        // in SortedMap the keys would be sorted
        // firstKey, lastKey

        // NavigableMap adds more functionality like finding the closest matches for specific search
        //similar to NavigableSet
       
    }
    
}

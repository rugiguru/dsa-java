package collectionsBasics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);


        // for (Integer x : set) {
        //     System.out.print(x + ",");
        // }

        // System.out.println();

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        // for (Integer x : set2) {
        //     System.out.print(x + ",");
        // }


        // when we use custom class to store in hashset , we always have to override the 
        // hashCode and equala method , because when we store any object in hashset
        // the hashcode method of Object class will be called which jst
        // returns the some value of location and when we try to check if that object 
        // exists inm the hashset we wont be able to lcate it as the new objects hashcodes 
        // are awlasy different


        Set<Student> sSet = new HashSet<>();

        sSet.add(new Student(30, 40));
        sSet.add(new Student(50, 48));
        sSet.add(new Student(60, 75));
        sSet.add(new Student(89, 97));


        System.out.println(sSet.contains(new Student(50, 48)));
    }
    
}

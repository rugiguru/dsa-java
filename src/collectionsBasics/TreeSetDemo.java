package collectionsBasics;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] myArgs){


        NavigableSet<Integer> ss = new TreeSet<>();

        ss.add(5);
        ss.add(5);
        ss.add(-1);
        ss.add(4);
        ss.add(9);


        for (Integer integer : ss) {
            System.out.print(integer + ",");
        }

        System.out.println();

        System.out.println(ss.ceiling(2));


    }
    
}

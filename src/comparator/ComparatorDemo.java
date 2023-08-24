package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{

    int rollNo;
    String name;
    int age;

    Student(int r, String n, int age){
        this.rollNo = r;
        this.name = n;
        this.age = age;
    }

    public String toString()
    {
        // Returning attributes of Student
        return this.rollNo + " " + this.name + " "
            + this.age;
    }
}


class SortByRollNo implements Comparator<Student> {

    public int compare(Student a, Student b){
        return a.rollNo - b.rollNo;
    }

}

public class ComparatorDemo {

    public static void main(String[] args) {
          // Creating an empty ArrayList of Student type
          ArrayList<Student> ar = new ArrayList<Student>();
 
          // Adding entries in above List
          // using add() method
          ar.add(new Student(111, "Mayank", 10));
          ar.add(new Student(131, "Anshul", 20));
          ar.add(new Student(121, "Solanki", 26));
          ar.add(new Student(101, "Aggarwal", 18));

          Collections.sort(ar, new SortByRollNo());

          for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).toString());
          }
    }
    
}

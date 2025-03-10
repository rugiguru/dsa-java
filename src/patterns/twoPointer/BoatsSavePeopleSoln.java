package patterns.twoPointer;

import java.util.Arrays;

public class BoatsSavePeopleSoln {

    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        while(i <= j){
            if((people[i] + people[j]) <=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;



    }
}

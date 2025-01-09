package patterns.twoPointer;

public class ReverseVowelSoln {

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();

        int l = 0;
        int r = str.length-1;
        String word = new String("aeiouAEIOU");
        while( l < r){
            if(word.indexOf(str[l]) != -1 && word.indexOf(str[r]) != -1 ){
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            } else if(word.indexOf(str[l]) == -1){
                l++;
            } else {
                r--;
            }
        }

        return new String(str);


    }


}

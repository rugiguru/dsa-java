package graph;

import java.util.*;

class WordLadder2 {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<ArrayList<String>> q = new LinkedList<>();
        ArrayList<String> ls = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> usedOnLevel = new ArrayList<>();
        ls.add(beginWord);
        q.add(ls);
        usedOnLevel.add(beginWord);
        int level = 0;

        while (!q.isEmpty()) {
            ArrayList<String> temp = q.peek();
            q.remove();

            if (temp.size() > level) {
                level++;
                for (String st : usedOnLevel) {
                    set.remove(st);
                }
            }

            String word = temp.get(temp.size() - 1);
            if (word.equals(endWord)) {
                if (ans.size() == 0) {
                    ans.add(temp);
                } else if (ans.get(0).size() == temp.size()) {
                    ans.add(temp);
                }
            }

            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArr = word.toCharArray();
                    replacedCharArr[i] = ch;
                    String replacedWord = new String(replacedCharArr);

                    if (set.contains(replacedWord)) {
                        temp.add(replacedWord);
                        ArrayList<String> tempList = new ArrayList<>(temp);
                        q.add(tempList);
                        usedOnLevel.add(replacedWord);
                        temp.remove(temp.size() - 1);
                    }
                }
            }

        }
        return ans;
    }
}

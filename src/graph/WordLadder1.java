//package graph;
//
//import java.util.*;
//
//class WordLadder1 {
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//
//        Queue<Pair<String, Integer>> queue = new LinkedList<>();
//
//        queue.add(new Pair(beginWord, 1));
//
//        Set<String> lookUp = new HashSet<>(wordList);
//
//        lookUp.remove(beginWord);
//
//        while(!queue.isEmpty()){
//            String word = queue.peek().getKey();
//            Integer count = queue.peek().getValue();
//            queue.remove();
//            for(int i = 0; i < word.length(); i++){
//                for(char ch = 'a'; ch <= 'z'; ch++){
//                    char[] wordCharArr = word.toCharArray();
//                    wordCharArr[i] = ch;
//
//                    String replacedWord = new String(wordCharArr);
//                    if(lookUp.contains(replacedWord)){
//                        lookUp.remove(replacedWord);
//                        queue.add(new Pair(replacedWord, count+1));
//                    }
//                }
//            }
//
//            if(word.equals(endWord) == true) return count;
//        }
//        return 0;
//
//    }
//}

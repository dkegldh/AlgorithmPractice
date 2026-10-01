// https://school.programmers.co.kr/learn/courses/30/lessons/12951
package October.Oct01;

import java.util.ArrayList;
import java.util.List;

public class num12951 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "3people  unFollowed me ";
    String result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution {
  public String solution(String s) {
    String answer = "";
    String[] word = s.split(" ", -1);
    StringBuilder sb = new StringBuilder();
    List<String> wordList = new ArrayList<>();
    for (int i = 0; i < word.length; i++) {
      if (word[i].isBlank()) {
        wordList.add(word[i]);
      } else {
        String n = word[i].substring(0, 1).toUpperCase() + word[i].substring(1).toLowerCase();
        wordList.add(n);
      }
    }
    for (int j = 0; j < wordList.size(); j++) {
      if (j == wordList.size() -1) {
        sb.append(wordList.get(j));
      } else {
        sb.append(wordList.get(j)).append(" ");
      }
    }
    answer = sb.toString();
    return answer;
  }
}
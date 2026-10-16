// https://school.programmers.co.kr/learn/courses/30/lessons/84512 Lv.2
package October.Oct16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num84512 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String word = "AAAE";
    int result = sol.solution(word);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String word) {
    int answer = 0;
    String[] alphabet = {"A", "E", "I", "O", "U"};
    List<String> all = new ArrayList<>();
    List<String> current = new ArrayList<>();
    current.add("");
    for (int i = 1; i <= 5; i++) {
      List<String> next = new ArrayList<>();
      for (String w : current) {
        for (String n : alphabet) {
          next.add(w.concat(n));
        }
      }
      all.addAll(next);
      current = next;
    }
    Collections.sort(all);

    for (String m : all) {
      answer++;
      if(m.equals(word)) {
        break;
      }
    }

    return answer;
  }
}
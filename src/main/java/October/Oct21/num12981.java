// https://school.programmers.co.kr/learn/courses/30/lessons/12981 Lv.2
package October.Oct21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num12981 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int n = 3;
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    int[] result = sol.solution(n, words);
    System.out.println(Arrays.toString(result));
  }
}

class Solution1 {
  public int[] solution(int n, String[] words) {
    List<String> list = new ArrayList<>();
    String pre = "";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      boolean wrongStart = i > 0 && pre.charAt(pre.length() - 1) != word.charAt(0);

      if(list.contains(word) || wrongStart) {
        return new int[] {i % n + 1, i / n + 1};
      }

      list.add(word);
      pre = word;
    }

    return new int[] {0, 0};
  }
}
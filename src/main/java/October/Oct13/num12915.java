// https://school.programmers.co.kr/learn/courses/30/lessons/12915
package October.Oct13;

import java.util.Arrays;

public class num12915 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] strings = {"abce", "abcd", "cdx"};
    int n = 1;
    String[] result = sol.solution(strings, n);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public String[] solution(String[] strings, int n) {
    String[] answer = new String[strings.length];
    String[] save = new String[strings.length];
    for (int i = 0; i < strings.length; i++) {
      char a = strings[i].charAt(n);
      save[i] = a + strings[i];
    }
    Arrays.sort(save);
    for (int j = 0; j < save.length; j++) {
      answer[j] = save[j].substring(1);
    }

    return answer;
  }
}
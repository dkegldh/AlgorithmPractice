package October.Oct03;

import java.util.Arrays;
import java.util.Collections;

public class num12917 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "Zbcdefg";
    String result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution1 {
  public String solution(String s) {
    String answer = "";
    String[] m = new String[s.length()];
    for (int i = 0; i < m.length; i++) {
      m[i] = String.valueOf(s.charAt(i));
    }
    Arrays.sort(m, Collections.reverseOrder());

    answer = String.join("", m);

    return answer;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
package September.Sep28;

import java.util.Arrays;

public class num12939 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "1 2 3 4";
    String result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution1 {
  public String solution(String s) {
    String answer = "";
    String[] s1 = s.split(" ");
    int[] n1 = new int[s1.length];

    for (int i = 0; i < s1.length; i++) {
      n1[i] = Integer.parseInt(s1[i]);
    }

    int min = Arrays.stream(n1).min().getAsInt();
    int max = Arrays.stream(n1).max().getAsInt();

    StringBuilder res = new StringBuilder();
    res.append(min).append(" ").append(max);

    answer = res.toString();

    return answer;
  }
}
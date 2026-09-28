// https://school.programmers.co.kr/learn/courses/30/lessons/12922
package Sep28;

public class num12922 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 4;
    String result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public String solution(int n) {
    StringBuilder sentence = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      if(i % 2 != 0) {
        sentence.append("수");
      } else {
        sentence.append("박");
      }
    }

    String answer = sentence.toString();

    return answer;
  }
}
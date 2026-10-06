// https://school.programmers.co.kr/learn/courses/30/lessons/68935
package October.Oct06;

public class num68935 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int n = 45;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(int n) {
    int answer = 0;
    String num3 = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
    answer = Integer.parseInt(num3, 3);
    return answer;
  }
}
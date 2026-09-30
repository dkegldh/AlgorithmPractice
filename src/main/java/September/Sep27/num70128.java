// https://school.programmers.co.kr/learn/courses/30/lessons/70128
package September.Sep27;

public class num70128 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] a = {-1, 0, 1};
    int[] b = {1, 0, -1};
    int result = sol.solution(a, b);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(int[] a, int[] b) {
    int answer = 0;
    for (int i = 0; i < a.length; i++) {
      int res1 = a[i] * b[i];
      answer += res1;
    }
    return answer;
  }
}
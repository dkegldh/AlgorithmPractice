// https://school.programmers.co.kr/learn/courses/30/lessons/12985 Lv.2
package October.Oct19;

public class num12985 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int n = 8;
    int a = 4;
    int b = 7;
    int result = sol.solution(n, a, b);
    System.out.println(result);
  }
}

class Solution1
{
  public int solution(int n, int a, int b)
  {
    int answer = 0;

    while (a != b) {
      if(a % 2 != 0) {
        a += 1;
      }
      if(b % 2 != 0) {
        b += 1;
      }

      a = (a + 1) / 2;
      b = (b + 1) / 2;

      answer++;
    }

    return answer;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
package October.Oct06;

public class num12924 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 15;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int n) {
    int answer = 0;
    int hab = 0;
    for (int i = 1; i <= n; i++) {
      hab = 0;
      for (int j = i; j <= n; j++) {
        if(hab <= n) {
          hab += j;
          if(hab == n) {
            answer++;
            break;
          }
        } else {
          break;
        }
      }
    }
    return answer;
  }
}
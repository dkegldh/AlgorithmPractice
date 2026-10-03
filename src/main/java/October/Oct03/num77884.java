// https://school.programmers.co.kr/learn/courses/30/lessons/77884
package October.Oct03;

public class num77884 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int left = 24;
    int right = 27;
    int result = sol.solution(left, right);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      int count = 0;
      for(int j = 1; j <= i; j++) {
        if(i % j == 0) {
          count++;
        }
      }
      if(count % 2 == 0) {
        answer += i;
      } else {
        answer -= i;
      }
    }

    return answer;
  }
}
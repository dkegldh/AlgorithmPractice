// https://school.programmers.co.kr/learn/courses/30/lessons/12901 Lv.1
package November.Nov21;

public class num12901 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int a = 5;
    int b = 24;
    String result = sol.solution(a, b);
    System.out.println(result);
  }
}

class Solution {
  public String solution(int a, int b) {
    String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int total = 0;
    for (int i = 0; i < a - 1; i++) {
      total += months[i];
    }
    total +=  b - 1;

    return days[total % 7];
  }
}
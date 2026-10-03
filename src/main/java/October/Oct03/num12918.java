// https://school.programmers.co.kr/learn/courses/30/lessons/12918
package October.Oct03;

public class num12918 {

  public static void main(String[] args) {
    Solution2 sol = new Solution2();
    String s = "a234";
    boolean result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution2 {
  public boolean solution(String s) {
    boolean answer = true;
    if(s.length() == 4 || s.length() == 6) {
      for (int i = 0; i < s.length(); i++) {
        int num = s.charAt(i);

        if(num > 57 || num < 48) {
          answer = false;
          break;
        }
      }
    } else {
      answer = false;
    }

    return answer;
  }
}
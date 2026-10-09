// https://school.programmers.co.kr/learn/courses/30/lessons/12911
package October.Oct09;

public class num12911 {

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
    int increase_number = n;
    int num1 = 0;
    int num2 = 0;
    String a = Integer.toBinaryString(n);
    for (int i = 0; i < a.length(); i++) {
      if(a.charAt(i) == '1') {
        num1++;
      }
    }
    while (num1 != num2) {
      increase_number++;
      num2 = 0;
      String b = Integer.toBinaryString(increase_number);
      for (int j = 0; j < b.length(); j++) {
        if(b.charAt(j) == '1') {
          num2++;
        }
      }
    }
    answer = increase_number;

    return answer;
  }
}
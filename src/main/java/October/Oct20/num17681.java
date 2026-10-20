// https://school.programmers.co.kr/learn/courses/30/lessons/17681 Lv.1
package October.Oct20;

import java.util.Arrays;

public class num17681 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    String[] result = sol.solution(n, arr1, arr2);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];

    for (int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      int num = arr1[i] | arr2[i];
      String binary = String.format("%" + n + "s", Integer.toBinaryString(num)).replace(' ', '0');
      for (int j = 0; j < n; j++) {
        char c = binary.charAt(j);
        if(c == '1') {
          sb.append("#");
        } else {
          sb.append(" ");
        }
      }
      answer[i] = sb.toString();
    }

    return answer;
  }
}
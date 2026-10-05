// https://school.programmers.co.kr/learn/courses/30/lessons/70129
package October.Oct05;

import java.util.Arrays;

public class num70129 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "110010101001";
    int[] result = sol.solution(s);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(String s) {
    int[] answer = new int[2];
    int totalCount = 0;
    int remove = 0;
    String update = s;

    while (!update.equals("1")) {
      int count = 0;
      for (int i = 0; i < update.length(); i++) {
        if (update.substring(i, i + 1).equals("1")) {
          count++;
        } else {
          remove++;
        }
      }
      update = Integer.toBinaryString(count);
      totalCount++;
    }

    answer[0] = totalCount;
    answer[1] = remove;

    return answer;
  }
}
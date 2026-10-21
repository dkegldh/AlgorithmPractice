// https://school.programmers.co.kr/learn/courses/30/lessons/131701 Lv.2
package October.Oct21;

import java.util.HashSet;
import java.util.Set;

public class num131701 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] elements = {7,9,1,1,4};
    int result = sol.solution(elements);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] elements) {
    int answer = 0;
    Set<Integer> numSet = new HashSet<>();
    for (int i = 0; i < elements.length; i++) {
      int num = 0;
      int order = 0;
      int result = 0;
      while (num < elements.length) {
        result += elements[(i + order) % elements.length];
        numSet.add(result);
        order++;
        num++;
      }
    }

    answer = numSet.size();
    return answer;
  }
}
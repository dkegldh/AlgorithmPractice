// https://school.programmers.co.kr/learn/courses/30/lessons/131127 Lv.2
package November.Nov06;

import java.util.HashMap;
import java.util.Map;

public class num131127 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] want = {"banana", "apple", "rice", "pork", "pot"};
    int[] number = {3, 2, 2, 2, 1};
    String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
    int result = sol.solution(want, number, discount);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String[] want, int[] number, String[] discount) {
    int answer = 0;

    for (int i = 0; i <= discount.length - 10; i++) {
      Map<String, Integer> count = new HashMap<>();
      for (int j = i; j < i + 10; j++) {
        count.put(discount[j], count.getOrDefault(discount[j], 0) + 1);
      }

      boolean ok = true;
      for (int k = 0; k < want.length; k++) {
        if(count.getOrDefault(want[k], 0) < number[k]) {
          ok = false;
          break;
        }
      }

      if(ok) {
        answer++;
      }
    }

    return answer;
  }
}
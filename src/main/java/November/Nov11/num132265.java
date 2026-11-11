// https://school.programmers.co.kr/learn/courses/30/lessons/132265 Lv.2
package November.Nov11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class num132265 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] topping = {1, 2, 3, 1, 4};
    int result = sol.solution(topping);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] topping) {
    int answer = 0;
    Map<Integer, Integer> toppingType = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    for (int num : topping) {
      toppingType.put(num, toppingType.getOrDefault(num, 0) + 1);
    }

    for (int i = 0; i < topping.length; i++) {
      set.add(topping[i]);
      toppingType.put(topping[i], toppingType.getOrDefault(topping[i], 0) - 1);
      if(toppingType.get(topping[i]) < 1) {
        toppingType.remove(topping[i]);
      }
      if(set.size() == toppingType.size()) {
        answer++;
      }
    }

    return answer;
  }
}
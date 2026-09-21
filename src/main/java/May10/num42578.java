package May10;

import java.util.HashMap;
import java.util.Map;

public class num42578 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[][] list = {{"yello_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    int result = sol.solution(list);
    System.out.println(result);
  }

}

class Solution {
  public int solution(String[][] clothes) {
    int answer = 1;
    Map<String, Integer> list = new HashMap<>();
    for (int i = 0; i < clothes.length; i++) {
      list.put(clothes[i][1], list.getOrDefault(clothes[i][1], 0) + 1);
    }

    for(int num : list.values()) {
      answer *= (num + 1);
    }

    answer = answer - 1;

    return answer;
  }
}
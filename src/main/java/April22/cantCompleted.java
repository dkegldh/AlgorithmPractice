package April22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class cantCompleted {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};

    String answer = sol.solution(participant, completion);

    System.out.println(answer);
  }

}
class Solution {
  public String solution(String[] participant, String[] completion) {
    Map<String, Integer> map = new HashMap<>();

    for(String player : participant) {
      map.put(player, map.getOrDefault(player, 0) + 1);
    }
    for(String player : completion) {
      map.put(player, map.get(player) - 1);
    }
    for(String key : map.keySet()) {
      if(map.get(key) != 0) {
        return key;
      }
    }
    return "";
  }
}
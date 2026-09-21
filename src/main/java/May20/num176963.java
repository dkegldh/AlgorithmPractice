package May20;

import java.util.HashMap;
import java.util.Map;

public class num176963 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
    int[] result = sol.solution(name, yearning, photo);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}

class Solution {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];
    Map<String, Integer>  list = new HashMap<>();

    for (int i = 0; i < name.length; i++) {
      list.put(name[i], yearning[i]);
    }

    for (int i = 0; i < photo.length; i++) {
      int num = 0;
      for (int j = 0; j < photo[i].length; j++) {
        String photoName = photo[i][j];
        if(list.containsKey(photoName)) {
          num += list.get(photoName);
        }
      }
      answer[i] = num;
    }
    return answer;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/49994 Lv.2
package October.Oct27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class num49994 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String dirs = "LULLLLLLU";
    int result = sol.solution(dirs);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String dirs) {
    int answer = 0;
    int[] coordinate = {0, 0};
    Set<String> set = new HashSet<>();

    for (int i = 0; i < dirs.length(); i++) {
      String m = Arrays.toString(coordinate);
      int[] pre = coordinate.clone();
      char direction = dirs.charAt(i);
      switch (direction) {
        case 'L':
          coordinate[0]--;
          break;
        case 'R':
          coordinate[0]++;
          break;
        case 'U':
          coordinate[1]++;
          break;
        case 'D':
          coordinate[1]--;
          break;
      }
      if(coordinate[0] >= -5 && coordinate[0] <= 5 && coordinate[1] >= -5 && coordinate[1] <= 5) {
        String to = Arrays.toString(coordinate);
        set.add(m + to);
        set.add(to + m);
      } else {
        coordinate = pre;
      }
    }

    answer = set.size() / 2;

    return answer;
  }
}
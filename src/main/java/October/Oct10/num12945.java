// https://school.programmers.co.kr/learn/courses/30/lessons/12945
package October.Oct10;

import java.util.HashMap;
import java.util.Map;

public class num12945 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int n = 50;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution1 {

  public int solution(int n) {
    int answer = 0;
    switch (n) {
      case 1:
        return 1;
      case 0:
        return 0;
    }
    Map<Integer, Integer> fiboMap = new HashMap<>();

    fiboMap.put(0, 0);
    fiboMap.put(1, 1);

    for (int i = 2; i <= n; i++) {
      fiboMap.put(i, (fiboMap.get(i - 1) + fiboMap.get(i - 2)) % 1234567);
    }

    answer = fiboMap.get(n);

    return answer;
  }
}
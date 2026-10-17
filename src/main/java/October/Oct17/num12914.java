// https://school.programmers.co.kr/learn/courses/30/lessons/12914 Lv.2
package October.Oct17;

import java.util.HashMap;
import java.util.Map;

public class num12914 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 4;
    long result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public long solution(int n) {
    long answer = 0;
    switch (n) {
      case 1:
        return 1;
      case 2:
        return 2;
    }

    Map<Integer, Integer> num = new HashMap<>();

    num.put(1, 1);
    num.put(2, 2);

    for (int i = 3; i <= n; i++) {
      num.put(i, (num.get(i - 1) + num.get(i - 2)) % 1234567);
    }

    answer = num.get(n);

    return answer;
  }
}
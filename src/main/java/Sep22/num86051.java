// https://school.programmers.co.kr/learn/courses/30/lessons/86051
package Sep22;

import java.util.ArrayList;
import java.util.List;

public class num86051 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
    int result = sol.solution(numbers);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] numbers) {
    int answer = 0;
    List<Integer> num = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      num.add(i, i);
    }

    for (int i : numbers) {
      if(num.contains(i)) {
        num.remove(Integer.valueOf(i));
      }
    }

    for (int n : num) {
      answer += n;
    }

    return answer;
  }
}
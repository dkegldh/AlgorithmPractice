// https://school.programmers.co.kr/learn/courses/30/lessons/68644
package October.Oct08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class num68644 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] numbers = {2,1,3,4,1};
    int[] result = sol.solution(numbers);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int[] numbers) {
    int[] answer = {};
    List<Integer> habs = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        int hab = numbers[i] + numbers[j];
        if(!habs.contains(hab)) {
          habs.add(hab);
        }
      }
    }
    Collections.sort(habs);
    answer = habs.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer;
  }
}
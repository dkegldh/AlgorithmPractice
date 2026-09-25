// https://school.programmers.co.kr/learn/courses/30/lessons/12935
package Sep25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num12935 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = {4, 3, 2, 1};
    int[] result = sol.solution(arr);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int[] arr) {
    List<Integer> numList = new ArrayList<>();
    int[] x = {-1};
    for (int num : arr) {
      numList.add(num);
    }
    if(numList.size() > 1) {
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if(min > arr[i]) {
          min = arr[i];
        }
      }
      for (int j = 0; j < numList.size(); j++) {
        if(numList.get(j) == min) {
          numList.remove(j);
        }
      }
    } else {
      return x;
    }
    int[] answer = numList.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer;
  }
}
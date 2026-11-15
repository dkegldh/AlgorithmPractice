// https://school.programmers.co.kr/learn/courses/30/lessons/64065 Lv.2
package November.Nov15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class num64065 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
    int[] result = sol.solution(s);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(String s) {
    String cleaned = s.substring(2, s.length() - 2).replace("},{", "-");
    String[] arr = cleaned.split("-");
    Arrays.sort(arr, Comparator.comparingInt(String::length));

    List<int[]> intNums = new ArrayList<>();
    List<Integer> resultNums = new ArrayList<>();
    for (String str : arr) {
      String[] nums = str.split(",");
      int[] numArr = Arrays.stream(nums)
          .mapToInt(Integer::parseInt)
          .toArray();
      intNums.add(numArr);
    }

    for (int i = 0; i < intNums.size(); i++) {
      int[] check = intNums.get(i);
      for (int j = 0; j < check.length; j++) {
        if(!resultNums.contains(check[j])) {
          resultNums.add(check[j]);
        }
      }
    }
    int[] answer = resultNums.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer;
  }
}
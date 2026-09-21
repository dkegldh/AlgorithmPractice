package April27;

import java.util.Arrays;

public class maxNumber {

  public static void main(String[] args) {
    int[] arr = {6, 10, 2};

    Solution1 sol = new Solution1();

    String result = sol.solution(arr);

    System.out.println(result);
  }

}

class Solution1 {
  public String solution(int[] numbers) {
    String[] arr = new String[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      arr[i] = String.valueOf(numbers[i]);
    }

    Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

    if(arr[0].equals("0")) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    for (String s : arr) {
      sb.append(s);
    }
    String answer = sb.toString();
    return answer;
  }
}
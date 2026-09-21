package May27;

import java.util.Arrays;

public class num12910 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = {5, 9, 7, 10};
    int divisor = 5;
    int[] result = sol.solution(arr, divisor);
    System.out.println(Arrays.toString(result));
  }

}

class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
    int[] fail = {-1};
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] % divisor == 0) {
        count++;
      }
    }

    answer = new int[count];
    int index = 0;
    for (int num : arr) {
      if(num % divisor == 0) {
        answer[index] = num;
        index++;
      }
    }
    Arrays.sort(answer);

    if(answer.length > 0) {
      return answer;
    } else {
      return fail;
    }
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/135808 Lv.1
package November.Nov07;

import java.util.Arrays;
import java.util.Stack;

public class num135808 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
    int result = sol.solution(k, m, score);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int k, int m, int[] score) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    Arrays.sort(score);
    for (int num : score) {
      stack.add(num);
    }

    while (stack.size() - m >= 0) {
      int[] arr = new int[m];

      for (int i = 0; i < m; i++) {
        arr[i] = stack.pop();
      }

      int min = Arrays.stream(arr).min().getAsInt();
      int n = min * m;

      answer += n;
    }


    return answer;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42584 Lv.2
package October.Oct25;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class num42584 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] prices = {1, 2, 3, 2, 3};
    int[] result = sol.solution(prices);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Queue<Integer> queue = new ArrayDeque<>();
    int pointer = 0;

    for (int num : prices) {
      queue.add(num);
    }

    while(!queue.isEmpty()) {
      int count = 0;
      int check = queue.poll();
      for (int num : queue) {
        if(check <= num) {
          count++;
        } else {
          count++;
          break;
        }
      }
      answer[pointer] = count;
      pointer++;
    }

    return answer;
  }
}
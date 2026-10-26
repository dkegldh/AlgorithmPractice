// https://school.programmers.co.kr/learn/courses/30/lessons/42583 Lv.2
package October.Oct26;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class num42583 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7,4,5,6};
    int result = sol.solution(bridge_length, weight, truck_weights);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    Queue<Integer> queue = new ArrayDeque<>();
    List<int[]> bridge = new ArrayList<>();

    for (int num : truck_weights) {
      queue.add(num);
    }

    while (!queue.isEmpty() || !bridge.isEmpty()) {
      answer++;

      for (int[] truck : bridge) {
        truck[0]++;
      }
      if(!bridge.isEmpty() && bridge.get(0)[0] > bridge_length) {
        bridge.remove(0);
      }

      int total = 0;
      for (int[] truck : bridge) {
        total += truck[1];
      }

      if(!queue.isEmpty() && total + queue.peek() <= weight) {
        int num = queue.poll();
        bridge.add(new int[] {1, num});
      }
    }

    return answer;
  }
}
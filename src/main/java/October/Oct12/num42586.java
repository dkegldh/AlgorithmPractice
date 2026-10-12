// https://school.programmers.co.kr/learn/courses/30/lessons/42586
package October.Oct12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num42586 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};
    int[] result = sol.solution(progresses, speeds);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    int[] answer = {};
    List<Integer> counts = new ArrayList<>();
    Queue<Integer> days = new LinkedList<>();
    int num = 0;
    int count = 0;

    for (int i = 0; i < progresses.length; i++) {
      int progress = progresses[i];
      int speed = speeds[i];
      int day = 0;
      while (progress < 100) {
        progress += speed;
        day++;
      }
      days.add(day);
    }

    num = days.poll();
    count++;

    while (!days.isEmpty()) {
      int num1 = days.peek();
      if(num < num1) {
        num = days.poll();
        counts.add(count);
        count = 1;
      } else {
        days.poll();
        count++;
      }
    }

    counts.add(count);

    answer = counts.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer;
  }
}
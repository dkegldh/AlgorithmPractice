// https://school.programmers.co.kr/learn/courses/30/lessons/42587 Lv.2
package October.Oct24;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class num42587 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    int result = sol.solution(priorities, location);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<int[]> queue = new ArrayDeque<>();
    List<Integer> list = new ArrayList<>();
    boolean check = true;

    for (int i = 0; i < priorities.length; i++) {
      int[] arr = {i, priorities[i]};
      queue.add(arr);
      list.add(priorities[i]);
    }

    while (check) {
      int[] arr1 = queue.peek();
      int max = Collections.max(list);
      if(arr1[1] >= max) {
        if(arr1[0] == location) {
          answer++;
          break;
        }
        queue.poll();
        list.remove(Integer.valueOf(arr1[1]));
        answer++;
      } else {
        int[] arr2 = queue.poll();
        queue.add(arr2);
      }
    }

    return answer;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/154538 Lv.2
package November.Nov02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class num154538 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int x = 10;
    int y = 40;
    int n = 5;
    int result = sol.solution(x, y, n);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int x, int y, int n) {
    if(x == y) {
      return 0;
    }

    int[] dist = new int[y + 1];
    Arrays.fill(dist, -1);
    Queue<Integer> queue = new ArrayDeque<>();

    dist[x] = 0;
    queue.add(x);

    while (!queue.isEmpty()) {
      int cur = queue.poll();

      int[] nexts = {cur + n, cur * 2, cur * 3};
      for (int next : nexts) {
        if(next < y && dist[next] == -1) {
          dist[next] = dist[cur] + 1;
          queue.add(next);
        } else if(next == y) {
          dist[next] = dist[cur] + 1;
          return dist[next];
        }
      }
    }

    return -1;
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/86971 Lv.2
package November.Nov23;

import java.util.Arrays;

public class num86971 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 9;
    int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
    int result = sol.solution(n, wires);
    System.out.println(result);
  }
}

class Solution {
  private int dfs(int cur, int n, boolean[][] graph, boolean[] visit) {
    visit[cur] = true;
    int count = 1;
    for (int next = 1; next <= n; next++) {
      if(!visit[next] && graph[cur][next]) {
        count += dfs(next, n, graph, visit);
      }
    }
    return count;
  }
  public int solution(int n, int[][] wires) {
    boolean[][] graph = new boolean[n + 1][n + 1];
    for (int[] wire : wires) {
      graph[wire[0]][wire[1]] = true;
      graph[wire[1]][wire[0]] = true;
    }

    int answer = n;

    for (int[] wire : wires) {
      int a = wire[0];
      int b = wire[1];

      graph[a][b] = false;
      graph[b][a] = false;

      boolean[] visit = new boolean[n + 1];
      int size = dfs(a, n, graph, visit);
      answer = Math.min(answer, Math.abs(n - 2 * size));
      graph[a][b] = true;
      graph[b][a] = true;
    }

    return answer;
  }
}
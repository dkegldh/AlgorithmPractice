package May19;

import java.util.LinkedList;
import java.util.Queue;

public class num1844 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1} , {0, 0, 0, 0, 1}};
    int result = sol.solution(maps);
    System.out.println(result);
  }

}

class Solution {
  
  public int solution(int[][] maps) {
    int n = maps.length;
    int m = maps[0].length;

    boolean[][] visit = new boolean[maps.length][maps[0].length];

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{0, 0});
    visit[0][0] = true;

    while(!q.isEmpty()) {
      int[] current = q.poll();
      int cx = current[0];
      int cy = current[1];

      for (int i = 0; i < 4; i++) {
        int nx = cx + dx[i];
        int ny = cy + dy[i];

        if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
          if(maps[nx][ny] == 1 && !visit[nx][ny]) {
            visit[nx][ny] = true;
            q.add(new int[]{nx, ny});

            maps[nx][ny] = maps[cx][cy] + 1;
          }
        }
      }
    }
    if(maps[n - 1][m - 1] == 1) {
      return -1;
    } else {
      return maps[n - 1][m - 1];
    }
  }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/43162 Lv.3
package November.Nov14;

public class num43162 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 3;
    int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    int result = sol.solution(n, computers);
    System.out.println(result);
  }
}

class Solution {
  private void dfs(int cur, int n, int[][]computers, boolean[] visit) {
    visit[cur] = true;
    for (int next = 0; next < n; next++) {
      if(computers[cur][next] == 1 && !visit[next]) {
        dfs(next, n, computers, visit);
      }
    }
  }

  public int solution(int n, int[][] computers) {
    int answer = 0;
    boolean[] visit = new boolean[n];

    for (int i = 0; i < n; i++) {
      if(!visit[i]) {
        dfs(i, n, computers, visit);
        answer++;
      }
    }

    return answer;
  }
}
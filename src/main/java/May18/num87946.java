package May18;

public class num87946 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
    int k = 80;
    int result = sol.solution(k, dungeons);
    System.out.println(result);
  }
}

class Solution {
  int max = 0;

  public void dfs(int currentK, int[][] dungeons, boolean[] visited, int count) {
    max = Math.max(max, count);

    for (int i = 0; i < dungeons.length; i++) {
      if(!visited[i] && currentK >= dungeons[i][0]) {
        visited[i] = true;
        dfs(currentK - dungeons[i][1], dungeons, visited, count + 1);
        visited[i] = false;
      }
    }
  }

  public int solution(int k, int[][] dungeons) {
    int answer = -1;
    boolean[] visited = new boolean[dungeons.length];

    dfs(k,  dungeons, visited, 0);
    answer = max;
    return answer;
  }
}
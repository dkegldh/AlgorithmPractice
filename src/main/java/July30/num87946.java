package July30;

public class num87946 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int k = 80;
    int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
    int result = sol.solution(k, dungeons);
    System.out.println(result);
  }
}

// boolean[] visited = new boolean[dungeons.length]
// 재귀함수
//  int dfs(int tired, int[] a, int i) {
//    if(a[0] <= tired) {
//      tired -= a[1];
//    }
//    visited[i] = true;
//    return tired;
//}
class Solution {
  int max = 0;

  int dfs(int tired, int count, boolean[] visited, int[][]dungeons) {
    max = Math.max(max, count);

    for (int i = 0; i < dungeons.length; i++) {
      if(visited[i]) {
        continue;
      }
      if(tired >= dungeons[i][0]) {
        visited[i] = true;
        tired -= dungeons[i][1];
        count++;
        dfs(tired, count, visited, dungeons);
        visited[i] = false;
        tired += dungeons[i][1];
        count--;
      }
    }
    return max;
  }

  public int solution(int k, int[][] dungeons) {
    int answer = -1;
    boolean[] visited = new boolean[dungeons.length];
    answer = dfs(k, 0, visited, dungeons);
    return answer;
  }
}
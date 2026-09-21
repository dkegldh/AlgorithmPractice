package July29;

import java.util.Arrays;

public class num161989 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 8;
    int m = 4;
    int[] section = {2, 3, 6};
    int result = sol.solution(n, m, section);
    System.out.println(result);
  }
}

// bfs
// boolean[] paint = new boolean[n]; -> 모두 true;
// -> section에 있는 숫자만 false;
// n의 크기만큼 for문 for(int i = 0; i < n; i++) 조건 : if(n <= i + m)
// -> for(int j = 1; j <= m; j++)
// if paint가 false면 paint[j] = true
// 아닐경우 continue;

class Solution {
  public int solution(int n, int m, int[] section) {
    int answer = 0;
    boolean[] paint = new boolean[n];
    for (int i = 0; i < section.length; i++) {
      paint[section[i] - 1] = true;
    }
    for (int i = 0; i < n;) {
      if(paint[i]) {
        answer++;
        i += m;
      } else {
        i++;
      }
    }
    return answer;
  }
}
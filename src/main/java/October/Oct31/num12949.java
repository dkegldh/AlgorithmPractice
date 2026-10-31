// https://school.programmers.co.kr/learn/courses/30/lessons/12949 Lv.2
package October.Oct31;

import java.util.Arrays;

public class num12949 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2 = {{3, 3}, {3, 3}};
    int[][] result = sol.solution(arr1, arr2);
    System.out.println(Arrays.deepToString(result));
  }
}

class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int n = arr1.length;
    int k = arr2[0].length;
    int m = arr2.length;
    int[][] answer = new int[n][k];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < k; j++) {
        int num = 0;
        for (int t = 0; t < m; t++) {
          num += arr1[i][t] * arr2[t][j];
        }
        answer[i][j] = num;
      }
    }

    return answer;
  }
}
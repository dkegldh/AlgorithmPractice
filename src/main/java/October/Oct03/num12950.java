// https://school.programmers.co.kr/learn/courses/30/lessons/12950
package October.Oct03;

import java.util.Arrays;

public class num12950 {

  public static void main(String[] args) {
    Solution3 sol = new Solution3();
    int[][] arr1 = {{1, 2}, {2, 3}};
    int[][] arr2 = {{3, 4}, {5, 6}};
    int[][] result = sol.solution(arr1, arr2);
    System.out.println(Arrays.toString(result));
  }
}

class Solution3 {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr1[0].length];

    for (int i = 0; i < arr1.length; i++) {
      for(int j = 0; j < arr1[i].length; j++) {
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return answer;
  }
}
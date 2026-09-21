package April27;

public class minSquare {

  public static void main(String[] args) {
    int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    Solution sol = new Solution();
    int result = sol.solution(sizes);
    System.out.println(result);
  }

}

class Solution {
  public int solution(int[][] sizes) {
    int answer = 0;
    int maxH = 0;
    int maxW = 0;

    for (int[] num : sizes) {
      int w = Math.max(num[0], num[1]);
      int h = Math.min(num[0], num[1]);

      maxH = Math.max(maxH, h);
      maxW = Math.max(maxW, w);
    }
    answer = maxH * maxW;

    return answer;
  }
}
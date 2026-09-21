package April21;

import java.util.Arrays;

public class sort {

  public static void main(String[] args) {
    int[] array = {1,5,2,6,3,7,4};
    int[][] commands = {{2,5,3},{4,4,1}, {1,7,3}};
    Solution sol = new Solution();
    int[] answer = sol.solution(array, commands);

    System.out.println(Arrays.toString(answer));
  }

}
class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];


    for (int i = 0; i < commands.length; i++) {
      int start = commands[i][0];
      int end = commands[i][1];
      int slice = commands[i][2];

      int[] temp = Arrays.copyOfRange(array, start - 1, end);
      Arrays.sort(temp);

      answer[i] = temp[slice - 1];
    }

    return answer;
  }
}
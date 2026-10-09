// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package October.Oct09;

import java.util.Arrays;

public class num142086 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "banana";
    int[] result = sol.solution(s);
    System.out.println(Arrays.toString(result));
  }
}

class Solution1 {
  public int[] solution(String s) {
    int[] answer = new int[s.length()];
    char[] alphabet = new char[s.length()];
    int count = 0;
    answer[0] = -1;
    for (int i = 0; i < s.length(); i++) {
      alphabet[i] = s.charAt(i);
    }

    for (int j = 1; j < alphabet.length; j++) {
      for (int k = j - 1; k >= 0; k--) {
        count++;
        if(alphabet[k] == alphabet[j]) {
          answer[j] = count;
          count = 0;
          break;
        } else {
          if(k == 0) {
            answer[j] = -1;
            count = 0;
          }
        }
      }
    }

    return answer;
  }
}
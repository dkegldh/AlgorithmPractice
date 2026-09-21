package May31;

import java.util.Arrays;

public class num12930 {

  public static void main(String[] args) {
    Solution2 sol = new Solution2();
    String s = "try hello world";
    String result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution2 {
  public String solution(String s) {
    String answer;
    String[] sen = new String[s.length()];
    int wordIndex = 0;

    for (int i = 0; i < s.length(); i++) {
      String current = String.valueOf(s.charAt(i));
      if(current.equals(" ")) {
        sen[i] = " ";
        wordIndex = 0;
      } else {
        if(wordIndex % 2 == 0) {
          sen[i] = current.toUpperCase();
        } else {
          sen[i] = current.toLowerCase();
        }
        wordIndex++;
      }
    }
    answer = String.join("", sen);
    return answer;
  }
}
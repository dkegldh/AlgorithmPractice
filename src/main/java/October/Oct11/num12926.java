// https://school.programmers.co.kr/learn/courses/30/lessons/12926
package October.Oct11;

import java.util.Arrays;
import java.util.List;

public class num12926 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "a B z";
    int n = 1;
    String result = sol.solution(s, n);
    System.out.println(result);
  }
}

class Solution {
  public String solution(String s, int n) {
    String answer = "";
    StringBuilder sb = new StringBuilder();
    String[] a1 = new String[26];
    String[] a2 = new String[26];
    List<String> a1List = Arrays.asList(a1);
    List<String> a2List = Arrays.asList(a2);

    for (int i = 0; i < 26; i++) {
      a1[i] = String.valueOf((char) ('A' + i));
      a2[i] = String.valueOf((char) ('a' + i));
    }

    for (int j = 0; j < s.length(); j++) {
      char alphabet = s.charAt(j);
      if(alphabet != ' ') {
        if(Character.isUpperCase(alphabet)) {
          int index = a1List.indexOf(String.valueOf(alphabet));
          sb.append(a1List.get((index + n) % 26));
        } else {
          int index = a2List.indexOf(String.valueOf(alphabet));
          sb.append(a2List.get((index + n) % 26));
        }
      } else {
        sb.append(" ");
      }
    }

    answer = sb.toString();

    return answer;
  }
}
package May25;

public class num12903 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "abcde";
    String result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution {
  public String solution(String s) {
    String answer = "";
    if(s.length() % 2 == 0) {
      String m = String.valueOf(s.charAt(s.length() / 2 - 1));
      String n = String.valueOf(s.charAt(s.length() / 2));
      answer =  (m + n);
    }
    if(s.length() % 2 != 0) {
      String m = String.valueOf(s.charAt(s.length() / 2));
      answer = m;
    }
    return answer;
  }
}
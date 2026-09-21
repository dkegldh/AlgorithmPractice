package May18;

public class num155652 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "aukks";
    String skip = "wbqd";
    int index = 5;
    String result = sol.solution(s, skip, index);
    System.out.println(result);
  }

}

class Solution1 {
  public String solution(String s, String skip, int index) {
    String answer = "";
    String targetAlphabet = "";
    for (int i = 0; i < 26; i++) {
      char currentCh = (char) ('a' + i);
      if(!skip.contains(String.valueOf(currentCh))) {
        targetAlphabet += currentCh;
      }
    }
    for (int i = 0; i < s.length(); i++) {
      char chooseCh = s.charAt(i);
      int currentIdx = targetAlphabet.indexOf(chooseCh);
      int nextIdx = (currentIdx + index) % targetAlphabet.length();
      char currentCh = targetAlphabet.charAt(nextIdx);
      answer += currentCh;
    }

    return answer;
  }
}
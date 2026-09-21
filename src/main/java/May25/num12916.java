package May25;

public class num12916 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "abcde";
    boolean result = sol.solution(s);
    System.out.println(result);
  }

}

class Solution1 {
  boolean solution(String s) {
    String str = s.toLowerCase();
    int count = 0;
    int count1 = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = str.charAt(i);
      if(c == 'p') {
        count++;
      }
      if(c == 'y') {
        count1++;
      }
    }
    if(count == count1) {
      return true;
    } else {
      return false;
    }
  }
}
package May31;

public class num12925 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "-1234";
    int result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(String s) {
    int answer;
    answer = Integer.parseInt(s);
    return answer;
  }
}
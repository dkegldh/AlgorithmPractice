package May26;

public class num12931 {
  public static void main(String[] args) {
    int n = 123;
    Solution sol = new Solution();
    int result = sol.solution(n);
    System.out.println(result);
  }

}

class Solution {
  public int solution(int n) {
    int answer = 0;
    String num = String.valueOf(n);
    int div = (int) Math.pow(10, num.length() - 1);
    int res = n / div;
    answer += res;
    int next = n % div;

    for (int i = num.length(); i > 1; i--) {
      int a = div / 10;
      if(a > 1) {
        res = next / a;
        answer += res;
        next = next % a;
      } else {
        answer += (next / a);
      }
      div = a;
    }

    return answer;
  }
}
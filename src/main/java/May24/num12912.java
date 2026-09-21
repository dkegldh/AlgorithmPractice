package May24;

public class num12912 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int a = 3;
    int b = 3;
    long result = sol.solution(a, b);
    System.out.println(result);
  }

}

class Solution1 {
  public long solution(int a, int b) {
    long answer = 0;
    if(a < b) {
      int num = b - a + 1;
      for (int i = 0; i < num; i++) {
        answer += a;
        a++;
      }
    } else if(a > b) {
      int num = a - b + 1;
      for (int i = 0; i < num; i++) {
        answer += a;
        a--;
      }
    } else {
      answer = a;
    }
    return answer;
  }
}
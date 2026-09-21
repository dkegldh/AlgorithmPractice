package Sep17;

public class num76501 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] absolutes = {4, 7, 12};
    boolean[] sign = {true, false, true};
    int result = sol.solution(absolutes, sign);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;
    for (int i = 0; i < signs.length; i++) {
      if(!signs[i]) {
        absolutes[i] = absolutes[i] - absolutes[i] * 2;
      }
    }

    for (int num : absolutes) {
      answer += num;
    }

    return answer;
  }
}
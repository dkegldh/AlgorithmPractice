// https://school.programmers.co.kr/learn/courses/30/lessons/12941
package Sep29;

import java.util.Arrays;

public class num12941 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] A = {1, 2, 6};
    int[] B = {3, 4, 4};
    int result = sol.solution(A, B);
    System.out.println(result);
  }
}

class Solution1
{
  public int solution(int []A, int []B)
  {
    int answer = 0;
    int[] a = A;
    int[] b = B;
    Arrays.sort(a);
    Arrays.sort(b);

    for (int j = 0; j < a.length; j++) {
      int gob = a[j] * b[a.length - 1 - j];
      answer += gob;
    }

    return answer;
  }
}
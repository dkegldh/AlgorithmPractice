// https://school.programmers.co.kr/learn/courses/30/lessons/12909
package Sep29;

public class num12909 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "())(()";
    boolean result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution {
  boolean solution(String s) {
    int count = 0;
    char[] arr = new char[s.length()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.charAt(i);
    }

    for (char a : arr) {
      if(arr[0] == '(' && arr[arr.length - 1] == ')' && count >= 0) {
        if(a == '(') {
          count++;
        } else {
          count--;
        }
      } else {
        return false;
      }
    }

    return count == 0;
  }
}
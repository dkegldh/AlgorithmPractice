// https://school.programmers.co.kr/learn/courses/30/lessons/81301
package October.Oct08;

public class num81301 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String s = "one4seveneight";
    int result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(String s) {
    int answer = 0;
    StringBuilder num = new StringBuilder();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if(Character.isDigit(s.charAt(i))) {
        num.append(s.charAt(i));
        continue;
      }
      sb.append(s.charAt(i));
      String a = sb.toString();
      switch (a) {
        case "zero":
          num.append(0);
          sb = new StringBuilder();
          break;
        case "one":
          num.append(1);
          sb = new StringBuilder();
          break;
        case "two":
          num.append(2);
          sb = new StringBuilder();
          break;
        case "three":
          num.append(3);
          sb = new StringBuilder();
          break;
        case "four":
          num.append(4);
          sb = new StringBuilder();
          break;
        case "five":
          num.append(5);
          sb = new StringBuilder();
          break;
        case "six":
          num.append(6);
          sb = new StringBuilder();
          break;
        case "seven":
          num.append(7);
          sb = new StringBuilder();
          break;
        case "eight":
          num.append(8);
          sb = new StringBuilder();
          break;
        case "nine":
          num.append(9);
          sb = new StringBuilder();
          break;
      }
    }
    answer = Integer.parseInt(num.toString());
    return answer;
  }
}
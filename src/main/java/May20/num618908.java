package May20;

public class num618908 {

  public static void main(String[] args) {

  }

}

class Solution1 {
  public String solution(String X, String Y) {
    StringBuilder sb = new StringBuilder();
    int[] countX = new int[10];
    int[] countY = new int[10];
    for (int i = 0; i < X.length(); i++) {
      int num = X.charAt(i) - '0';
      countX[num]++;
    }
    for (int i = 0; i < Y.length(); i++) {
      int num = Y.charAt(i) - '0';
      countY[num]++;
    }

    for (int i = 9; i >= 0;  i--) {
      int count = Math.min(countX[i], countY[i]);
      for (int j = 0; j < count; j++) {
        sb.append(i);
      }
    }

    if(sb.length() == 0) {
      return "-1";
    } else if (sb.charAt(0) == '0') {
      return "0";
    } else {
      return sb.toString();
    }
  }
}
package June31;

import java.util.ArrayList;
import java.util.List;

public class num12919 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    String[] seoul = {"Jane", "June","Kim"};
    String result = sol.solution(seoul);
    System.out.println(result);
  }
}

class Solution1 {
  public String solution(String[] seoul) {
    String answer;
    int num = 0;
    List<String> name = new ArrayList<>();
    for (int i = 0; i < seoul.length; i++) {
      name.add(seoul[i]);
    }
    for (int i = 0; i < name.size(); i++) {
      if(name.get(i).equals("Kim")) {
        num = i;
      }
    }
    String parseNum = String.valueOf(num);
    answer = "김서방은 " + parseNum + "에 있다";
    return answer;
  }
}
package July27;

public class num159994 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};
    String result = sol.solution(cards1, cards2, goal);
    System.out.println(result);
  }
}

class Solution {
  int idx1 = 0;
  int idx2 = 0;
  public String solution(String[] cards1, String[] cards2, String[] goal) {
    String answer = "";
    for (int i = 0; i < goal.length; i++) {
      if(idx1 < cards1.length && goal[i].equals(cards1[idx1])) {
        idx1++;
      } else if (idx2 < cards2.length && goal[i].equals(cards2[idx2])) {
        idx2++;
      } else {
        answer = "No";
        break;
      }
    }
    if(!answer.equals("No")) {
      answer = "Yes";
    }
    return answer;
  }
}
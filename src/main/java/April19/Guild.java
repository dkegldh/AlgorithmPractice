package April19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Guild {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int count = 0;
    int result = 0;
    List<Integer> arr = new ArrayList<>(input);

    for (int i = 0; i < input; i++) {
      arr.add(sc.nextInt());
    }
    Collections.sort(arr);

    for (int i = 0; i < input; i++) {
      count += 1;
      if(count >= arr.get(i)) {
        result++;
        count = 0;
      }
    }

    System.out.println(result);
  }

}

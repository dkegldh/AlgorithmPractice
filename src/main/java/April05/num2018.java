package April05;

import java.util.Scanner;

public class num2018 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    int end = 0;
    int count = 0;
    int sum = 0;

    for (int i = 0; i < num; i++) {
      arr[i] = i + 1;
    }
    for (int start = 0; start < num; start++) {
      while(sum < num && end < num) {
        sum += arr[end];
        end += 1;
      }
      if(sum == num) {
        count += 1;
      }
      sum -= arr[start];
    }

    System.out.println(count);

  }

}

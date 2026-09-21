package April06;

import java.util.Scanner;

public class num1546 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    double[] arr = new double[num];
    double max = 0;
    double sum = 0;


    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextDouble();
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    for (int i = 0; i < num; i++) {
      arr[i] = arr[i] / max * 100;
      sum += arr[i];
    }

    double avg = sum / num;
    System.out.println(avg);
  }

}

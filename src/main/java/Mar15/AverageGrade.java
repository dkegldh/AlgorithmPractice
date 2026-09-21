package Mar15;

import java.util.Scanner;

public class AverageGrade {
    public Double calculate(Double grade, String score) {
        double ans = 0.0;
        // switch문을 순회하며 (학점 * 과목평점)의 합을 구함
        switch(score) {
            case "A+":
                ans = grade * 4.5;
                break;
            case "A0":
                ans = grade * 4.0;
                break;
            case "B+":
                ans = grade * 3.5;
                break;
            case "B0":
                ans = grade * 3.0;
                break;
            case "C+":
                ans = grade * 2.5;
                break;
            case "C0":
                ans = grade * 2.0;
                break;
            case "D+":
                ans = grade * 1.5;
                break;
            case "D0":
                ans = grade * 1.0;
                break;
            case "F":
                ans = grade * 0.0;
                break;
        }

        return ans;
    }
    public static void main(String[] args) {
        AverageGrade averageGrade = new AverageGrade();
        // 스캐너를 통해 초기화
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[20];
        double totalGrade = 0.0;
        double total = 0.0;


        for (int i = 0; i < arr.length; i++) {
            if(!sc.hasNextLine()) {
                break;
            }

            String input = sc.nextLine();
            String[] stChange = input.split(" ");

            double grade = Double.parseDouble(stChange[1]);
            String score = stChange[2];

            if(score.equals("P")) {
                continue;
            }

            totalGrade += grade;
            total += averageGrade.calculate(grade, score);
        }

        // 결과 출력
        if(totalGrade != 0) {
            System.out.printf("%.6f\n", total / totalGrade);
        } else {
            System.out.println("0.000000");
        }

        sc.close();
    }
}
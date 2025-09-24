package basic;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3 개선!
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");

        // 입력받기 : sc.nextLine() => ""
        // "" 를 없애야한다면 : Integer.parseInt, Float.parsefloat 등 사용!

        // String num1 = sc.nextLine();
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parsefloat(sc.nextLine());
        // double input1 = Double.parsedouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // =, -, *, /
        String op = sc.nextLine();

        System.out.print("두 번째 숫자 입력 : ");
        // String num2 = sc.nextLine();
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }
}

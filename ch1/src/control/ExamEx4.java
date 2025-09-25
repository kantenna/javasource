package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        // 입력 : 15, 25, +
        // 출력 : 15 + 25 = 40
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("두번째 숫자 입력 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("연산자 입력 : ");
        String op = sc.nextLine();

        int result = num + num2;
        switch (op) {
            case "+":
                result = num + num2;
                break;
            case "-":
                result = num - num2;
                break;
            case "*":
                result = num * num2;
                break;
            case "/":
                result = num / num2;
                break;
        }
        System.out.printf("%d %s %d = %d", num, op, num2, result);
    }
}

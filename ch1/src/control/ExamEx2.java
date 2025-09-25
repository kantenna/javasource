package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 큰 값과 가장 작은 값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("두번째 수 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("세번째 수 : ");
        int num3 = Integer.parseInt(sc.nextLine());

        int i = num1;

        if (i > num2) {
            i = num2;
        } else if (i > num3) {
            i = num3;
        }
        System.out.println("가장 작은 수 " + i);

        if (i < num2) {
            i = num2;
        } else if (i < num3) {
            i = num3;
        }
        System.out.println("가장 큰 수 " + i);
    }
}

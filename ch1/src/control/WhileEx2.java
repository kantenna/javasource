package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345 : 3 + 4 + 5 = 12

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>");
        int num = Integer.parseInt(sc.nextLine());

        // num이 0이 아닐때까지 반복
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("각 자릿 수 합 " + sum);
    }
}

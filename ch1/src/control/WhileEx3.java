package control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자에게 숫자를 계속 받아들여서 합계를 출력
        // 사용자가 0 입력 시 종료

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("합계를 구할 숫자 입력 >> ");
            int num = Integer.parseInt(sc.nextLine());

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 : " + sum);
    }
}

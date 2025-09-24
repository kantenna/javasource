package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다");
        sc.close();
        // 입력받은 숫자가 짝수인지 홀수인지 출력하기
    }
}

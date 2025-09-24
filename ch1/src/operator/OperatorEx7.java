package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println(num > 0 ? "양수입니다" : (num == 0 ? "0입니다" : "음수입니다"));
        sc.close();
        // 입력받은 숫자가 양수, 음수인지 출력하기
    }
}

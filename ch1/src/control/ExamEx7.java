package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        boolean run = true;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 >>");
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액 >>");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.printf("잔액 %d.\n", balance);
                    break;
                case 4:
                    run = false;
                    System.out.println("종료합니다.");
                    break;
                default:
                    break;
            }
        }
    }
}

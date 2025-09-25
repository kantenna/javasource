package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간까지는 10030
        // 8시간 이후는 원래받던 금액의 1.5배
        // 오늘 근무 시간을 입력받아 하루 일당을 산출
        // 일당은 정수형으로
        Scanner sc = new Scanner(System.in);
        System.out.println("근무 시간을 입력 : ");
        int hours = Integer.parseInt(sc.nextLine());

        int rate = 10030, pay = 0;
        if (hours <= 8) {
            pay = hours * rate;
            System.out.printf("근무시간 %d, 임금 %d", hours, pay);
        } else {
            pay = (int) (rate * 8 + (hours - 8) * rate * 1.5);
            System.out.printf("근무시간 %d, 임금 %d", hours, pay);
        }
    }
}

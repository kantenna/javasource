package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 연도를 입력받아 윤년, 평년 출력
        // 연도를 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나
        // 연도를 400으로 나눈 나머지가 0이면

        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요 : ");
        int year = Integer.parseInt(sc.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년입니다");
        } else {
            System.out.println("평년입니다");
        }
        sc.close();
    }
}

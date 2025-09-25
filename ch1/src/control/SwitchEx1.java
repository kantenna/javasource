package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 월이 3,4,5 : 현재 계절은 봄입니다.
        // 월이 6,7,8 : 현재 계절은 여름입니다.
        // 월이 9,10,11 : 현재 계절은 가을입니다.
        // 월이 12,1,2 : 현재 계절은 겨울입니다.

        Scanner sc = new Scanner(System.in);
        System.out.println("현재 월을 입력하세요 : ");
        int month = Integer.parseInt(sc.nextLine());
        sc.close();

        if (month >= 3 && month < 6) {
            System.out.println("현재 계절은 봄입니다.");
        } else if (month >= 6 && month < 9) {
            System.out.println("현재 계절은 여름입니다.");
        } else if (month >= 9 && month < 12) {
            System.out.println("현재 계절은 가을입니다.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("현재 계절은 겨울입니다.");
        } else {
            System.out.println("월을 확인해 주세요.");
        }

        // 조건식을 판별 => 저간식과 일치하는 case문으로 이동 => 문장수행 => break나 switch문 빠져나감
        // 조건식 결과는 정수, 문자열만 가능
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울입니다.");
                break;
            default:
                System.out.println("월을 확인해 주세요.");
                break;
        }
    }
}

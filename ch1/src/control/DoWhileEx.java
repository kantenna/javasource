package control;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 : 1 ~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기

        int user = 0;
        int answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력 >> ");
            user = Integer.parseInt(sc.nextLine());
            if (user > answer) {
                System.out.println("정답보다 큽니다");
            } else if (user < answer) {
                System.out.println("정답보다 작습니다");
            }
        } while (answer != user);
        System.out.println("정답입니다");
    }
}

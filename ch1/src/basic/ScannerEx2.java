package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // println() : 출력 후 enter처리
        // print() : 출력(enter 없음)
        // printf() : 포멧 지정(enter 없음)
        System.out.print("두 자리 정수를 입력하세요 : ");
        String num = sc.nextLine(); // 35 => "35"
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1)); // "35" + 1 : 351 연결
        // "35" => 35
        int input = Integer.parseInt(num);
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
        sc.close();
    }
}

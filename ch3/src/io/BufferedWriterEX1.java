package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEX1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // q 입력 시 입력받던 걸 중지

        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("작성할 데이터를 입력");
        System.out.println("q : 증지");
        String content = null;

        do {
            System.out.println(">> ");
            input = sc.nextLine();
            content += input;
        } while (!input.equals("q"));

        try {
            FileWriter fww = new FileWriter("c:\\temp\\user.txt");
            BufferedWriter bw = new BufferedWriter(fww);
            bw.write(content);

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

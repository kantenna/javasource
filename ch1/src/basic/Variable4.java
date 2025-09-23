package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형 : 참, 거짓
        boolean flag = false;
        System.out.println(flag ? "참" : "거짓"); // 조건이 참이면 앞 실행, 거짓이면 뒤 실행

        // 문자형
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab';

        // 문자열 : "" + String
        // String ch3 = "a";

        System.out.println("ch = " + ch + ", ch2 = " + ch2);
        System.out.printf("ch = %c, ch2 = %c\n", ch, ch2);
        System.out.printf("ch = %10c, ch2 = %5c\n", ch, ch2);
        System.out.println("ch = " + (ch + 1)); // 98 (코드값으로 계산)
        System.out.println("ch2 = " + (ch2 + 1)); // 44033
        System.out.printf("ch = %c\n", (ch2 + 1)); // 각
        System.out.printf("ch = %d\n", (ch2 + 1)); // 44033
    }
}

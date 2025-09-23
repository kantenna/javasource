package basic;

public class Variable2 {
    public static void main(String[] args) {
        // long : L,l 을 붙이지 않는 경우 int 타입의 범위를 벗어나지 않아야 한다!
        long num = 10;
        long num2 = 1000000000000L; // L은 출력안된다

        System.out.println(num + " " + num2);
    }
}
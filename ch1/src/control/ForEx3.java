package control;

public class ForEx3 {
    public static void main(String[] args) {
        // ********** 5번 찍기
        // 중첩 for : 2차원의 개념 (행과 열)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단 반복
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                System.out.println();
            }
        }
    }
}

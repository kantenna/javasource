package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수를 선언 후 값을 할당!
        int num = 10;
        int sum = num + 20;

        // println 안에서 + 는 연결
        System.out.println("num 변수값 : " + num);
        System.out.println("num + 20 = " + sum);
        System.out.printf("num 변수값 : %d\n", num); // printf는 줄바꿈이 없다!

        int age = 25, maxSpeed = 10;
        System.out.println("age=" + age + ", maxSpeed=" + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed); // 자릿수를 지정 가능

        num = 35;

        // 상수 선언과 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30; 상수 선언 변경 불가!
    }
}

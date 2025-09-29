package object;

public class MyMathEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        MyMath myMath = new MyMath();

        // 메소드 호출
        // 1. 변수에 받기
        // 2. 출력문에 처리하기

        long result = myMath.add(12, 63);
        System.out.println("덧셈결과 : " + result);

        result = myMath.subtract(85, 35);
        System.out.println("뺄셈결과 : " + result);

        result = myMath.multiply(11, 9);
        System.out.println("곱셈결과 : " + result);

        double result2 = myMath.divide(30, 12);
        System.out.println("나눗셈결과 : " + result2);
    }
}

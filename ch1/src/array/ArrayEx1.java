package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열 (array)
        // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        // 연속적인 공간을 사용!
        // 한번 생성하면 길이 변경 불가능
        // 타입 배열명[] = new 타입[10]; 배열 선언과 생성
        // 타입[] 배열명 = new 타입[10]; 배열 선언과 생성

        // 10명 시험점수 저장
        // int score1 = 0, score2 = 0, score3 = 0;
        // int sum = score1 + score2 + score3;
        // double avg = (double) sum / 10;

        // 타입 : 기본형(int, long ,float, , double, boolean, char), 참조형(String...)

        int[] arr1 = new int[10]; // 정수형 선언
        System.out.println(arr1[3]); // 아무것도 안넣고 확인해봐도 0이 들어있다.

        double[] arr2 = new double[5]; // 실수형 선언
        System.out.println(arr2[0]); // 실수형 일때는 0.0

        boolean[] arr3 = new boolean[5]; // 논리형 선언
        System.out.println(arr3[1]); // 논리형 일때는 false

        char[] arr4 = new char[5]; // 문자형 선언
        System.out.println(arr4[0] + "arr"); // 비어있음

        // 초기화
        // arr1[0] = 88, arr1[1] = 90, arr1[2] = 82;

        // 배열을 선언, 생성, 초기화 한번에
        int score[] = { 88, 90, 98, 94, 77, 78, 79, 75, 72, 66 };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}

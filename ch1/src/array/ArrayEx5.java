package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0 ~ 9의 숫자로 초기화
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 100; i++) {
            // 0~9 임의의 수 추출
            int x = (int) (Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[x];
            arr[x] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

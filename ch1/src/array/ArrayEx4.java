package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        // 최댓값과 최솟값 출력
        int max = score[0], min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.printf("최댓값: %d 최솟값: %d", max, min);
    }
}

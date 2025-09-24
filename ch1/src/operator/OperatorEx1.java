package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단항 연산자 : ++ --
        // ++ : +1, -- : -1
        int i = 5;
        i++;
        System.out.println(i);

        int j = 10;
        j--;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++;
        System.out.println("l = k++; 실행 후, k=" + k + ", l=" + l);

        k = 5;
        l = 0;
        l = ++k;
        System.out.println("l = k++; 실행 후, k=" + k + ", l=" + l);
    }
}

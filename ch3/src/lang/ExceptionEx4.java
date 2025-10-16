package lang;
// 다중 catch

public class ExceptionEx4 {
    public static void main(String[] args) {

        try {
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            // Exception이 발생하면 해야 하는 작업
            e.printStackTrace(); // 예외사항 추적
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) { // 부모 Exception이 제일 마지막에 위치해야함
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 재실행");
        }

        // 개별로 나누어서 처리 해도됨!
        try {
            String data2 = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {

        }
    }
}

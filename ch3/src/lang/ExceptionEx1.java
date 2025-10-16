package lang;

// Exception(예외)

// 종류
// 1) 컴파일 예외 : ClassNotFoundException
// 2) 런타인 예외 : ArithmeticException
// 처리 방법
// 1) 예외 처리
// - try ~ catch
// catch 작성 시
// 하나로 모든 exception 처리 : try{}catch(Exception e){}
// 개별로 exception 처리 : 다중 catch, 멀티 catch
// - try ~ catch ~ finally
// finally( exception 발생 여부와 상관없이 꼭 실행해야할 코드 작성! )
// - try ~ finally
// 2) 예외 던지기
// 메소드() throw 예외명, 예외명

// 강제 Exception 발생시키기
// - 사용자 정의 예외
// throw new xxxException();

public class ExceptionEx1 {
    public static void main(String[] args) {
        // System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("null");
    }
}

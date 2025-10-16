package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1. NullPointerException
        String str = null; // 참조 타입 초기화에만 null 초기화 가능
        Value v = null;
        // int i = null; 이런 기본 타입에는 안됨

        // 변수 자체는 찍을 수 있다.
        System.out.println(str);
        // if (str != null) {
        // System.out.println(str.length()); // NullPointerException
        // }

        // 2. ArrayIndexOutOfBoundsException
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);
        }

        // 3. NumberFormatException

        try {
            // Exception이 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            // Exception이 발생하면 해야 하는 작업
            e.printStackTrace(); // 예외사항 추적
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        }

        // 4. ClassCastException
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
    }
}

package object;

public class TriangleEx {
    public static void main(String[] args) {

        // 속성(멤버변수) 초기화
        // 1. 직접 접근(속성)
        // triangle.baseline = 12;
        // triangle.height = 6;

        // 2. 생성자
        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이 : " + triangle1.getArea());

        // 3. setter method
        Triangle triangle2 = new Triangle();
        triangle2.setBaseline(10);
        triangle2.setHeight(5);
        System.out.println("넓이 : " + triangle2.getArea());
    }
}

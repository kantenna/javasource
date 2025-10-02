package inheritance;

// final
// class : 상속 불가
// method : 오버라이딩 불가
public /* final */ class Person {
    // final : 마지막의, 변결될 수 없는

    static final int MAX = 15; // 상수
    String name;

    public Person(String name) {
        this.name = name;
    }

    final void test() {

    }
}

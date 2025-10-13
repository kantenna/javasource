package inheritance;

// 멤버 변수에 final 붙이면 상수 => 반드시 초기화 필요
public interface Movable {
    // 상수 선언만 가능
    // final 없어도 상수로 인식
    int pos = 0;

    // abstract 없어도 추상 메소드로 인식
    void move(int x, int y);

    // static, default를 붙이면 일반메소드 생성 가능
    static void print() {
    }

    default void print2() {
    }
}

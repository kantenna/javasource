package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = i; // 묵시적 형 변환 (자동 형 변환) => 작은 타입을 큰 타입에 대입 시
        int i2 = (int) f;

        double d = i; // 자동 형 변환
        int i3 = (int) d;

        // <==============명시===================
        // byte, short, int, long, float, double
        // char
        // ===============자동==================>
    }
}

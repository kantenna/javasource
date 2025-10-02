package inheritance;
// 다형성(polymophism)

// 여러가지 형태를 가지는 능력
// 상속관계에서만 관측

// 부모 = new 자식()
// ----
// print (자식)
// void print(부모){};

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Animal animal = new Animal();
        Canivore canivore = new Canivore();
        canivore.eat();
        canivore.print();

        Herbivore herbivore = new Herbivore();
        // ClassCastException
        // 자식 = 부모 (X)
        herbivore = (Herbivore) animal;
        herbivore.eat();

        // 부모 = 자식
        // Animal animal = new Canivore();
        // animal.eat(); // eat()은 오버라이딩 되어 실행 가능
        // // animal.print(); // 얘는 안됨
        // ((Canivore) animal).print(); // 형변환해서 부르기

        // animal = new Herbivore();
        // animal.eat();

        // Canivore canivore2 = new Canivore();
        // herbivore = (herbivore) canivore2; 자식끼리는 당연히 형변환 안됨
    }
}

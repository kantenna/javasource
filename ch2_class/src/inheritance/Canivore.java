package inheritance;

// 육식동물
public class Canivore extends Animal {

    String name;

    public Canivore() {
        // super(); 얘가 숨어있음
        System.out.println("Canivore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹는다");
    }

    public void print() {
        System.out.println(name + "육식동물");
    }
}

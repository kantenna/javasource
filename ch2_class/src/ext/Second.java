package ext;

import exam.Parent;

public class Second extends Parent {
    Parent parent = new Parent();

    public void print() {

    }

    public void info() {
        // super.name = "성춘향"; default 선언이라 안됨
        super.grade = "B"; // protected 는 상속 받으면 가능
        parent.getNum1();
    }
}

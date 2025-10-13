package exam;

public class ColorTV extends TV {

    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.printf("%d인치 %d컬러", getSize(), this.color);
    }

}

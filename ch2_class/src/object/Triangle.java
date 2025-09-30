package object;

public class Triangle {
    // 속성 : 밑변(baseline), 높이(height)
    double baseline;
    double height;

    public Triangle() {
    }

    public Triangle(double baseline, double height) {
        this.baseline = baseline;
        this.height = height;
    }

    // 기능 : 삼각형 넓이(getArea())
    double getArea() {
        return baseline * height / 2;
    }

    public void setBaseline(double baseline) {
        this.baseline = baseline;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

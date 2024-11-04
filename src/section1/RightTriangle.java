package section1;

public class RightTriangle {
    private double edgeA;
    private double edgeB;

    public RightTriangle(double edgeA, double edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    public double tinhChuVi() {
        double hypotenuse = Math.sqrt(edgeA * edgeA + edgeB * edgeB);
        return edgeA + edgeB + hypotenuse;
    }

    public double tinhDienTich() {
        return (edgeA * edgeB) / 2;
    }
}

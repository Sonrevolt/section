package section1;

public class TinhToan {
    public int Tong(int a, int b){
        return a + b;
    }
    public double Tong(double a, double b){
        return a + b;
    }
    public int Hieu(int a, int b){
        return a - b;
    }
    public double Hieu(double a, double b){
        return a - b;
    }
    public int Tich(int a, int b){
        return a * b;
    }
    public double Tich(double a, double b){
        return a * b;
    }
    public int Thuong(int a, int b){
        if (b == 0)
            throw new ArithmeticException("Khong chia cho 0");
        return a / b;
    }

    public double Thuong(double a, double b){
        if (b == 0)
            throw new ArithmeticException("Khong chia cho 0");
        return a / b;
    }
}

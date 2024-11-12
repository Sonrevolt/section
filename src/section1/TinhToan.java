package section1;//Package

public class TinhToan {
    public int Tong(int a, int b){
        return a + b;
    }
    //overload
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
            throw new ArithmeticException("Khong chia cho 0");//xảy ra biểu thức toán học sai
        return a / b;
    }

    //double a: bien nguyen
    //hàm
    public double Thuong(double a, double b){
        if (b == 0)
            throw new ArithmeticException("Khong chia cho 0");
        return a / b;
    }
}

class Main{
    public static void main(String args[]){
        TinhToan c = new TinhToan();
        System.out.println("Tong(int): " + c.Tong(4, 2));
        System.out.println("Hieu(int): " + c.Hieu(4, 2));
        System.out.println("Tich(int): " + c.Tich(4, 2));
        System.out.println("Thuong(int): " + c.Thuong(4, 2));
        System.out.println("Tong(double): " + c.Tong(5.5,2.2));
        System.out.println("Hieu(double): " + c.Hieu(5.5,2.2));
        System.out.println("Tich(double): " + c.Tich(5.5,2.2));
        System.out.println("Thuong(double): " + c.Thuong(5.5,2.2));
    }
}

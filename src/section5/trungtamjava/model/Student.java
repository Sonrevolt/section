package section5.trungtamjava.model;
import java.util.Scanner;
public class Student {
    private int id;
    private String name;
    private String address;
    private String major;

    public Student(){}

    public Student(int id, String name, String address, String major){
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Major: ");
        major = sc.nextLine();
    }

    // Hàm info để in ra thông tin của đối tượng
    public void info() {
        System.out.println("Student Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Major: " + major);
    }
}

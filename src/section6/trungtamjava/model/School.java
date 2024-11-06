package section6.trungtamjava.model;
import java.util.Scanner;
public class School {
    private int id;
    private String schoolName;
    private String address;
    public School(){}

    public School(int id, String schoolName, String address){
        this.id = id;
        this.schoolName = schoolName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id: ");
        this.id = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        System.out.print("Enter school name: ");
        this.schoolName = sc.nextLine();

        System.out.print("Enter address: ");
        this.address = sc.nextLine();
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("School name: " + schoolName);
        System.out.println("Address: " + address);
    }
}

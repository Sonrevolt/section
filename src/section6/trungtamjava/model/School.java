package section6.trungtamjava.model;

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
}

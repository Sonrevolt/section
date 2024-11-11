package section10;

abstract class Person{
    abstract void salary();
}
class Employee extends Person{
    @Override
    void salary() {
        System.out.println("Employee salary : 5 millions");
    }
}
class Boss extends  Person{
    @Override
    void salary() {
        System.out.println("Boss salary : 0 + luong trach nhiem va hoa hong  ");
    }
}
public class Person1 {
    public static void main(String[] args){
        Employee employee = new Employee();
        Boss boss = new Boss();
        employee.salary();
        boss.salary();
    }
}

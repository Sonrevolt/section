package section10;

abstract class Person{
    abstract void salary();
}
class Employee extends Person{
    @Override
    void salary() {
        System.out.println("Employee salary: 5 millions");
    }
}
class Boss extends  Person{
    @Override
}
public class Person1 {
    public static void main(String[] args){

    }
}

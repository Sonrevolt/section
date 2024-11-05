package section5.trungtamjava.main;
import section5.trungtamjava.model.*;
public class Info {
    public static void main(String[] args) {

        // Khởi tạo đối tượng bằng constructor mặc định
        Chair chair1 = new Chair();
        chair1.setMaterial("Wood");
        chair1.setColor("Brown");
        chair1.setWeightCapacity(100);
        // Khởi tạo đối tượng bằng constructor tuy bien
        Chair chair2 = new Chair("Plastic", "Red", 80);

        Table table1 = new Table();
        table1.setShape("Round");
        table1.setNumberLegs(4);
        table1.setMaterial("Metal");
        Table table2 = new Table("Square", 3, "Wood");


        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setRamSize(16);
        laptop1.setStorageSize(512);
        Laptop laptop2 = new Laptop("Apple", 8, 256);

        Person person1 = new Person();
        person1.setName("John Doe");
        person1.setAge(30);
        person1.setAddress("123 Main St");
        Person person2 = new Person("Jane Doe", 25, "456 Maple Ave");

        System.out.println("Chair 1: " + chair1.getMaterial() + ", " + chair1.getColor() + ", " + chair1.getWeightCapacity());
        System.out.println("Chair 2: " + chair2.getMaterial() + ", " + chair2.getColor() + ", " + chair2.getWeightCapacity());
        System.out.println("Table 1: " + table1.getShape() + ", " + table1.getNumberLegs() + ", " + table1.getMaterial());
        System.out.println("Table 2: " + table2.getShape() + ", " + table2.getNumberLegs() + ", " + table2.getMaterial());
        System.out.println("Laptop 1: " + laptop1.getBrand() + ", " + laptop1.getRamSize() + "GB, " + laptop1.getStorageSize() + "GB");
        System.out.println("Laptop 2: " + laptop2.getBrand() + ", " + laptop2.getRamSize() + "GB, " + laptop2.getStorageSize() + "GB");
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge() + ", " + person1.getAddress());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge() + ", " + person2.getAddress());
    }
}

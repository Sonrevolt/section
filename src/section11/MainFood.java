package section11;

enum FoodMenu {
    CAFE(1, "Cafe"),
    MILK_TEA(2, "Milk Tea");

    private int id;
    private String name;

    FoodMenu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class MainFood {
    public static void main(String[] args) {
        // Vòng lặp in các giá trị của enum
        for (FoodMenu menu : FoodMenu.values()) {
            System.out.println("ID: " + menu.getId() + ", Name: " + menu.getName());
        }

        // Đoạn code cho phần thứ 2
        Employee employee = new Employee(1, "a Doe") {
            @Override
            public double salary() {
                return 10000000;
            }
        };

        System.out.println("Employee Salary: " + employee.salary() + " VND");
    }
}

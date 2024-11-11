package section10.main;

import section10.model.Laptop;
import section10.service.LaptopServiceImpl;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        LaptopServiceImpl laptopService = new LaptopServiceImpl();
        laptopService.input(laptop);
        laptopService.info(laptop);
    }
}

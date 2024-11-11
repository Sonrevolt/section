package section10.service;

import section10.model.Laptop;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {
    Scanner sc = new Scanner(System.in);
    @Override
    public void input(Laptop lt) {
        System.out.print("Enter ID: ");
        lt.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Cpu: ");
        lt.setCpu(sc.nextLine());
        System.out.print("Enter Ram: ");
        lt.setRam(sc.nextLine());
        System.out.print("Enter Vga: ");
        lt.setVga(sc.nextLine());
    }
    @Override
    public void info(Laptop lt) {
        System.out.println("Laptop information: ");
        System.out.println("ID: " + lt.getId());
        System.out.println("CPU: " + lt.getCpu());
        System.out.println("RAM: " + lt.getRam());
        System.out.println("VGA: " + lt.getVga());
    }
}

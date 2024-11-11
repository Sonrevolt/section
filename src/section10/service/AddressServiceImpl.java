package section10.service;

import java.util.Scanner;
import section10.model.Address;
import section10.service.AddressService;

public class AddressServiceImpl implements AddressService {
    private Scanner sc = new Scanner(System.in);
    @Override
    public void input(Address address) {
        System.out.print("Enter Address ID: ");
        address.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Street: ");
        address.setStreet(sc.nextLine());
        System.out.print("Enter City: ");
        address.setCity(sc.nextLine());
    }

    @Override
    public void info(Address address) {
        System.out.println("Address Information:");
        System.out.println("ID: " + address.getId());
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
    }
}

package section8.main;

import section8.model.*;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Category Id: ");//Create Category
        int categoryId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Category Name: ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryId, categoryName);

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[n];//Create array

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product information " + (i + 1) + ":");
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            products[i] = new Product(productId, productName, price);
            products[i].setCategory(category);// Assign Category to Product
        }

        System.out.println("\nProduct information and category: ");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}

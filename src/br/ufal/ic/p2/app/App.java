package br.ufal.ic.p2.app;

import java.util.Scanner;

import br.ufal.ic.p2.entities.Customer;
import br.ufal.ic.p2.entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to shopping cart!");
        Scanner sc = new Scanner(System.in);
        int entry = 10;
        System.out.println("First, let's create your customer profile!");

        System.out.println("Enter customer ID: ");
        int ID = sc.nextInt();
        System.out.println("Enter customer name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter customer address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(ID, name, address);

        while (entry != 0) {
            System.out.print("Enter your choice: ");
            System.out.println("-------------------------------------");
            System.out.println("1 - Add product to shopping cart");
            System.out.println("2 - Remove product from shopping cart");
            System.out.println("3 - Empty shopping cart");
            System.out.println("4 - Get shopping cart contents");
            System.out.println("5 - Get shopping cart total price");
            System.out.println("6 - Get shopping cart item count");
            System.out.println("0 - Exit");
            System.out.println("-------------------------------------");

            entry = sc.nextInt();
            System.out.println("-------------------------------------");

            if (entry == 1) {
                System.out.println("Enter product name: ");
                sc.nextLine();
                String ProductName = sc.nextLine();
                System.out.println("Enter product price: ");
                double price = sc.nextDouble();
                customer.getShoppingCart().addProduct(new Product(ProductName, price));
                System.out.println("Product added to shopping cart!");
            } else if (entry == 2) {
                System.out.println("Enter product name: ");
                sc.nextLine();
                String ProductName = sc.nextLine();

                // atraves do customer vai acessar o shopping cart, que vai acessar o metodo
                // produto e remover
                customer.getShoppingCart().removeProduct(customer.getShoppingCart().findProduct(ProductName));
                // sera q é gambiarra?
            } else if (entry == 3) { // empty
                customer.getShoppingCart().emptyCart();
            } else if (entry == 4) {// contents
                System.out.println(customer.getShoppingCart().getContents());
            } else if (entry == 5) {// total price
                System.out.println(customer.getShoppingCart().getTotalPrice());
            } else if (entry == 6) {// amount of products
                System.out.println(customer.getShoppingCart().getItemCount());
            } else if (entry == 0) { // xau!!
                System.out.println("Bye!");
            } else {
                System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}

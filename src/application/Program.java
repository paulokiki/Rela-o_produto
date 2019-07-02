package application;

import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String nameClient = sc.nextLine();

        System.out.print("Email: ");
        String emailClient = sc.nextLine();

        System.out.print("Birth data: ");
        Date birthDate = sdf.parse(sc.nextLine()); // informar a data de maneira correta

        Client client = new Client(nameClient, emailClient, birthDate);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order?");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " item data:");
           
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            Double priceProduct = sc.nextDouble();

            Product product = new Product(nameProduct, priceProduct);
            
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            
            OrderItem orderItem =  new OrderItem(quantity, priceProduct);
            
            
            System.out.println("------------------------------------------------");
            
            

        }

    }

}

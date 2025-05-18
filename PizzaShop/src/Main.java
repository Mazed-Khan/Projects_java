import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Pizza type :");
            System.out.println("1.Deluxe Pizza 2.Normal Pizza");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                DeluxePizza deluxePizza = new DeluxePizza(true);
                System.out.println("Do you want takeaway? (y/n): ");
                char takeaway = scanner.next().charAt(0);
                if (takeaway == 'y' || takeaway == 'Y') {
                    deluxePizza.takeAway();
                }
                deluxePizza.totalBill();
                break;
            } else if (choice == 2) {
                Pizza pizza = new Pizza(true);
                System.out.println("Do you want extra cheese? (y/n): ");
                char cheese = scanner.next().charAt(0);
                if (cheese == 'y' || cheese == 'Y') {
                    pizza.addExtraCheese();
                }
                System.out.println("Do you want extra toppings? (y/n): ");
                char toppings = scanner.next().charAt(0);
                if (toppings == 'y' || toppings == 'Y') {
                    pizza.addExtraToppings();
                }

                System.out.println("Do you want takeaway? (y/n): ");
                char takeaway = scanner.next().charAt(0);
                if (takeaway == 'y' || takeaway == 'Y') {
                    pizza.takeAway();
                }
                pizza.totalBill();
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library_Manager library_manager = new Library_Manager();
    Scanner scanner = new Scanner(System.in);

    int choice;

    do {
        System.out.println("\n--- Library Menu ---");
        System.out.println("1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Search Book");
        System.out.println("6. Search Member");
        System.out.println("7. Display All Books");
        System.out.println("8. Display All Members");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                library_manager.addBook();
                break;
            case 2:
                library_manager.addMember();
                break;
            case 3:
                library_manager.borrowBook();
                break;
            case 4:
                library_manager.returnBook();
                break;
            case 5:
                library_manager.searchBook();
                break;
            case 6:
                library_manager.searchMember();
                break;
            case 7:
                library_manager.displayAllBooks();
                break;
            case 8:
                 library_manager.displayMembers();
                 break;
        }
    }while (choice!=9);
    }
}
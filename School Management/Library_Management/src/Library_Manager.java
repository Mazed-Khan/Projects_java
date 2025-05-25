import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_Manager {
    //Add Members
    private List<Member> members = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void addBook() {
        System.out.println("Enter Book Name : ");
        String title = scanner.nextLine();
        System.out.println("Enter Book Author : ");
        String author = scanner.nextLine();
        System.out.println("Enter Book ISBN : ");
        String isbn = scanner.nextLine();
        Book book = new Book(title,author,isbn);
        books.add(book);
        System.out.println("Book added successfully");
    }
    //Searching Books By isbn
    public void searchBook() {
        System.out.println("Enter Book ISBN for search: ");
        String isbn = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.displayInfo();
                found = true;
                break;
            }
        }if(!found){
            System.out.println("Book not found");
        }
    }
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found");
        }else  {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    public void addMember() {
        System.out.println("Enter Member ID: ");
        String memberId = scanner.nextLine();
        System.out.println("Enter Member Name: ");
        String memberName = scanner.nextLine();

        Member member = new Member(memberId, memberName);
        members.add(member);
        System.out.println("Student added successfully");
    }

    // Optional: display all members
    public void displayMembers() {
       if (members.isEmpty()) {
           System.out.println("No members found");
        }else  {
            for (Member member : members) {
               member.displayInfo();
            }
        }
    }

    public void searchMember() {
        System.out.println("Enter Member for search by id:  ");
        String memberId = scanner.nextLine();
        boolean found = false;
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                member.displayInfo();
                found = true;
                break;
            }
        }if(!found){
            System.out.println("Book not found");
        }
    }
    //BORROWING BOOKS

    public void borrowBook() {
        System.out.print("Enter your Member ID: ");
       String memberId = scanner.nextLine();
        System.out.print("Enter your Book ISBN: ");
        String isbn = scanner.nextLine();
        boolean found = false;
        for(Member member : members){
            for (Book book : books){
                if (member.getMemberId().equals(memberId) && book.getIsbn().equals(isbn)){
                    book.setAvailable(false);
                    System.out.println("Book has been borrowed successfully");
                    found = true;
                    break;
                }
            }
        }if(!found){
            System.out.println("Book & Member not found");
        }
    }
    public void returnBook() {
        System.out.print("Enter your Member ID: ");
        String memberId = scanner.nextLine();
        System.out.println("Enter your Book ISBN: ");
        String isbn = scanner.nextLine();
        boolean found = false;
        for(Member member : members){
            for (Book book : books){
                if (member.getMemberId().equals(memberId) && book.getIsbn().equals(isbn)){
                    book.setAvailable(true);
                    System.out.println("Book has been returned successfully");
                    found = true;
                    break;
                }
            }
        }if(!found){
            System.out.println("Book & Member not found");
        }
    }


}



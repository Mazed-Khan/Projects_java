package School_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentID, studentName);
        students.add(student);
        System.out.println("Student added successfully");
    }


    public void searchStudentId(){
        System.out.println("Enter Student ID to search: ");
        String studentID = scanner.nextLine();
        boolean found = false;

        for(Student student: students){
            if (student.getId().equalsIgnoreCase(studentID)) {
                student.displayInfo();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student ID not found");
        }
    }


    public void displayAllStudents(){
       if(students.isEmpty()){
           System.out.println("No students found");
       }else {
           for(Student student: students){
               student.displayInfo();
           }
       }
    }

    public void deleteStudent(){
        System.out.println("Enter Student ID to delete: ");
        String studentID = scanner.nextLine();
        boolean found = false;
        for(Student student: students){
            if (student.getId().equalsIgnoreCase(studentID)) {
                students.remove(student);
                found = true;
                System.out.println("Student deleted successfully");
                break;
            }
        }
        if(!found){
            System.out.println("Student ID not found");
        }
    }


    public void startMenuLoop(){
        int choice ;
        do{
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            while(!scanner.hasNextInt()){
                System.out.println("Invalid input.Enter a number between 1 and 5");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudentId();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting Program.....");
                default:
                    System.out.println("Invalid Choice.Please Try again");
            }

        }while(choice != 5);
    }
}


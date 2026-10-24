
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("------------------------");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(id, name, marks));

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.id == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Student s : students) {
                        if (s.id == updateId) {
                            sc.nextLine();

                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextInt();

                            System.out.println("Student updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == deleteId) {
                            students.remove(i);
                            System.out.println("Student deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the system!");
                    break;
                    
               
               
            }

        } while (choice != 6);

        sc.close();
    }
}
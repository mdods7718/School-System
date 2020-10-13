import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to create a student: \n"
                + "Press 2 to create an employee: ");

        int studentOrEmployee = Integer.parseInt(scanner.nextLine());


        if (studentOrEmployee == 1) {
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter address:");
            String address = scanner.nextLine();
            System.out.print("Enter phone number:");
            String number = scanner.nextLine();
            System.out.print("Enter email:");
            String email = scanner.nextLine();
            System.out.print("Enter student's status:");
            String status = scanner.nextLine();
            Student student1 = new Student(name, address, number, email, status);
            System.out.println(student1.toString());
        } else if (studentOrEmployee == 2) {
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter address:");
            String address = scanner.nextLine();
            System.out.print("Enter phone number:");
            String number = scanner.nextLine();
            System.out.print("Enter email:");
            String emailAddress = scanner.nextLine();
            System.out.println("Press 1 to create a faculty member: \n" +
                    "Press 2 to create a staff member: ");
            int facultyOrStaff = scanner.nextInt();

            if (facultyOrStaff == 1) {
                System.out.print("Enter office number:");
                int officeNum1 = scanner.nextInt();
                System.out.print("Enter salary:");
                int salary1 = scanner.nextInt();
                ;
                System.out.print("Enter date hired (dd-MM-yyyy):");
                String dateHired = scanner.next();
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateHired);
                System.out.print("Enter office hours:");
                String officeHours1 = scanner.next();
                System.out.print("Enter rank:");
                String rank1 = scanner.next();
                Faculty faculty1 = new Faculty(name, address, number, emailAddress, officeNum1, salary1, date1, officeHours1, rank1);
                System.out.println(faculty1.toString());

            } else if (facultyOrStaff == 2) {
                System.out.print("Enter office number:");
                int officeNum1 = scanner.nextInt();
                System.out.print("Enter salary:");
                int salary1 = scanner.nextInt();
                System.out.print("Enter date hired (dd-MM-yyyy)");
                String dateHired = scanner.next();
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateHired);
                System.out.print("Enter office hours:");
                String title1 = scanner.next();
                Staff staff1 = new Staff(name, address, number, emailAddress, officeNum1, salary1, date1, title1);
                System.out.println(staff1.toString());
            }
        }


    }
}
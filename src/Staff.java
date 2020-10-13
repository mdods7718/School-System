import java.util.Date;

public class Staff extends Employee{

    String title;

    public Staff(String name, String address, String number, String emailAddress, int officeNum, int salary, Date dateHired, String title) {
        super(name, address, number, emailAddress, officeNum, salary, dateHired);
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {

    }

    public String toString() {

        return "Staff: " + name + "\n"
                + "Salary: " + salary + "\n"
                + "Date Hired: " + dateHired + "\n"
                + "Office: " + officeNumber + "\n"
                + "Address: " + address + "\n"
                + "Phone Number: " + number + "\n"
                + "Email: " + emailAddress + "\n"
                + "Title: " + title + "\n";

    }


}
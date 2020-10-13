import java.util.Date;

public class Employee extends Person{

    int officeNumber;
    int salary;
    Date dateHired;

    public Employee(String name, String address,String number, String emailAddress, int officeNumber, int salary, Date dateHired) {
        super(name, address, number, emailAddress);
        this.officeNumber = officeNumber;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {

    }

    int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

    }

}
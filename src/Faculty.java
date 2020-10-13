import java.util.Date;

class Faculty extends Employee {

    String officeHours;
    String rank;

    public Faculty(String name, String address, String number, String emailAddress, int officeNum, int salary, Date dateHired, String officeHours, String rank) {
        super(name, address, number, emailAddress, officeNum, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;

    }

    String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {

    }

    String getRank() {
        return rank;
    }

    public void setRank(String rank) {

    }



    public String toString() {
        return "Faculty: " + name + "\n"
                + "Rank: " + rank + "\n"
                + "Salary: $" + salary + "\n"
                + "Date Hired: " + dateHired + "\n"
                + "Office Hours: " + officeHours + "\n"
                + "Office: " + officeNumber + "\n"
                + "Address: " + address + "\n"
                + "Phone Number: " + number + "\n"
                + "Email: " + emailAddress;
    }
}
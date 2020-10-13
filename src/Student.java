public class Student extends Person{

    private final static String FRESHMAN = "Freshman";
    private final static String SOPHOMORE = "Sophomore";
    private final static String JUNIOR = "Junior";
    private final static String SENIOR = "Senior";
    private String inClassStat;


    public Student(String inName, String inAddress,String inNum, String inEmailAddress, String inClassStat) {
        super(inName, inAddress, inNum, inEmailAddress);
        this.inClassStat = inClassStat;

    }

    public String getClassStat() {
        return inClassStat;
    }

    public void setClassStat(String classStat) {

    }

    public String toString(){

        return "Student: " + this.name + "\n"
                + "Status: " + this.inClassStat + "\n"
                + "Address: " + this.address + "\n"
                + "Phone Number: " + this.number + "\n"
                + "Email Address: " + this.emailAddress;
    }

}

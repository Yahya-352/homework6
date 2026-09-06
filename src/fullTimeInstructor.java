public class fullTimeInstructor extends Person{
    private double salaryRate;
    public fullTimeInstructor(String fName , String lName) {
        super(fName, lName);
    }

    @Override
    public String getRole() {
        return "Full Time Instructor";
    }
}

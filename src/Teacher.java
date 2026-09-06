public class Teacher extends fullTimeInstructor implements TeacherRole{

    public Teacher(String fName , String lName){
        super(fName , lName);
    }

    @Override
    public void teach(String subject) {
        System.out.println("Teacher " + firstName + " " + lastName + " teaches " + subject);
    }

    @Override
    public String toString() {
        return "Teacher " + firstName + " " + lastName;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }
}

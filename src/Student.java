public class Student extends Person implements StudentRole{

    private double currentGrade;


    public Student(String fName , String lName , double currentGrade){
        super(fName , lName);
        this.currentGrade = currentGrade;
    }



    public double getCurrentGrade() {
        return currentGrade;
    }


    public void learn(){
        System.out.println("I am Learning");
    }

    @Override
    public String toString() {
        return "Student name is " + firstName + " " + lastName + " and his current grade is " + currentGrade;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

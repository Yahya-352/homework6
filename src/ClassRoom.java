import java.util.ArrayList;

public class ClassRoom {

    Teacher teacher;
    ArrayList<Student> students;
    String className;
    double grade;

    public ClassRoom(String className , Teacher teacher , double grade){
        this.className = className;
        this.teacher = teacher;
        this.grade = grade;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (s.getCurrentGrade() == grade) {
            students.add(s);
        } else {
            System.out.println(s.getFirstName() + " does not belong to this grade");
        }
    }

    public ArrayList<Student> getStudentsList() {
        return students;
    }

    @Override
    public String toString() {
        return className;
    }

}

import java.util.ArrayList;

public class School {

    private String campusName;
    ArrayList<ClassRoom> classRooms;

    public School(String campusName){
        this.campusName = campusName;
        classRooms = new ArrayList<>();
    }

    public void addClassRoom(ClassRoom classRoom){
        classRooms.add(classRoom);
    }

    public String getCampusName() {
        return campusName;
    }

    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }
    @Override
    public String toString() {
        return "School: " + campusName + " with a number of" + classRooms.size() + " classrooms";
    }
}

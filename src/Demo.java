public class Demo {
    public static void main(String[] args) {
        // Create teacher and students
        Teacher t1 = new Teacher("Yahya", "Altaraifi");
        Student s1 = new Student("Yahya2", "Altaraifi2", 3);
        Student s2 = new Student("Yahya3", "Altaraifi3", 3);
        Student s3 = new Student("Yahya4", "Altaraifi4", 4);

        ClassRoom room = new ClassRoom("Room A", t1, 3);
        room.addStudent(s1);
        room.addStudent(s2);
        room.addStudent(s3);

        School school = new School("Yahya International school for yahyaaaas");
        school.addClassRoom(room);

        System.out.println(school);
        System.out.println(room);

        System.out.println("Teacher of " + room);
        System.out.println(room.teacher);

        System.out.println("Students actually in " + room);
        for (Student s : room.getStudentsList()) {
            System.out.println(s);
        }
    }
}
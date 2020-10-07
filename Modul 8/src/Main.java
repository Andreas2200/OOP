public class Main {

    public static void main(String[] args)
    {
        EnrollmentSystem es = new EnrollmentSystem();

        Student std1 = new Student("Jesper", 0);
        Student std2 = new Student("Sigurd", 1);
        Student std3 = new Student("Victor", 2);
        Student std4 = new Student("Andreas", 3);

        Course crs1 = new Course("OOP",30);
        Course crs2 = new Course("COS",30);
        Course crs3 = new Course("STAT",30);

        es.createCourseDB(10);
        es.createStudentDB(30);

        es.addCourse(crs1);
        es.addCourse(crs2);
        es.addCourse(crs3);

        es.getCourses();

        es.removeCourse(crs2);

        es.getCourses();

        es.addStudent(std1);
        es.addStudent(std2);
        es.addStudent(std3);
        es.addStudent(std4);

        es.getStudents();

        es.removeStudent(std4);

        es.getStudents();

        es.enroll(std1, crs1);
        es.enroll(std4, crs1);

        es.showParticipants(crs1);
    }
}

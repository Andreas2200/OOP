public class EnrollmentSystem
{
    Student[] students;
    Course[]  courses;

    int studentCount = 0;
    int courseCount = 0;

    public void enroll (Student student, Course course)
    {
        course.enroll(student);
    }

    public void remove (Student student, Course course)
    {
        course.remove(student);
    }

    public void showParticipants (Course course)
    {
        for (Student student: course.getParticipants())
        {
            System.out.println(student.getName());
        }
    }

    public void getCourses()
    {
        for (int i = 0; i < courseCount; i++)
        {
            System.out.println("");
            System.out.println(courses[i].name);
        }
    }

    public void getStudents()
    {
        for (int i = 0; i < studentCount; i++)
        {
            System.out.println("");
            System.out.println(students[i].name);
        }
    }

    public void addStudent(Student std)
    {
        students[studentCount] = std;
        studentCount++;
    }

    public void removeStudent(Student std)
    {
        for (int i = 0; i < studentCount; i++)
        {
            if(students[i].id == std.id)
            {
                System.out.println("");
                System.out.println("Removed: " + students[i].name);
                students[i] = null;
                for (int j = i +1; j < studentCount; j++)
                {
                    students[i] = students[j];
                }
                studentCount--;
            }
        }
    }

    public void addCourse(Course crs)
    {
        courses[courseCount] = crs;
        courseCount++;
    }
    public void removeCourse(Course crs)
    {
        for (int i = 0; i < courseCount; i++)
        {
            if(courses[i].name == crs.name)
            {
                System.out.println("");
                System.out.println("Removed: " + courses[i].name);
                courses[i] = null;
                for (int j = i +1; j < courseCount; j++)
                {
                    courses[i] = courses[j];
                }
                courseCount--;
            }
        }
    }

    public void createCourseDB(int size)
    {
        courses = new Course[size];
    }

    public void createStudentDB(int size)
    {
        students = new Student[size];
    }

}
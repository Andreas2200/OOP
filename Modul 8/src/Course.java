public class Course
{
    String name;
    Student[] participants;
    int id;

    Course (String name, int courseSize)
    {
        this.name = name;
        this.participants = new Student[courseSize];
    }

    public void enroll (Student student)
    {
        for (int i=0 ; i<participants.length ; i++)
        {
            if (participants[i]==null)
            {
                participants[i] = student;
                return;
            }
        }
    }

    public void remove (Student student)
    {
        for (int i=0 ; i<participants.length ; i++)
        {
            if (participants[i]==student)
            {
                participants[i] = null;
            }
        }
    }

    public Student[] getParticipants ()  // count number of entries
    {
        int count = 0;

        for (Student student: participants)
        {
            if (student != null)
            {
                count++;
            }
        }
        Student[] result = new Student[count]; // make a copy
        /*for (Student student: participants)
        {
            if (student != null)
            {
                result[count] = student;
            }
        }*/
        for (int i = 0; i < result.length; i++)
        {
            if(participants[i] != null) {
                result[i] = participants[i];
            }
        }
        return result;
    }
}

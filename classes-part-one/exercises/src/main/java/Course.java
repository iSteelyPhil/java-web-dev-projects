import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private final ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getTopic(){
        return topic;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    public Teacher getInstructor(){
        return instructor;
    }
    public void setInstructor(Teacher instructor){
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void addStudent(Student student){
        this.enrolledStudents.add(student);
    }
}

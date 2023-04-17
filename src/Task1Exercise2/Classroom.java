package Task1Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom() {
       this.students = new ArrayList<>();
    }

    public void addStudent (Student student){
        students.add(student);
    }

    public boolean isPresent(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void printClassroom(){
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}

package Task1Exercise2;

public class Task1Main {
    public static void main (String[] args){
        Classroom classroom = new Classroom();

        Student student1 = new Student("Deni");
        Student student2 = new Student("Lia",27);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        classroom.printClassroom();
    }
}


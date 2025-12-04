import java.util.*;

public class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeLowGradeStudents() {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }
    public void promoteStudents() {
        for (Student student : students) {
            student.promoteToNextCourse();
        }
    }
    public void printStudents(int course) {
        students.stream()
                .filter(student -> student.course == course)
                .forEach(student -> System.out.println(student.name));
    }
}


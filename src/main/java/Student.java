import java.util.Arrays;

public class Student {
    String name;
    int group;
    int course;
    double[] grades;

    public Student(String name, int group, int course, double[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public double getAverageGrade() {
        return Arrays.stream(grades).average().orElse(0);
    }
    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3) {
            this.course++;
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group=" + group + ", course=" + course + ", average grade=" + getAverageGrade() + "}";
    }
}


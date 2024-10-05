package InterviewQuestionsPart2;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private String sname;
    private Integer marks;

    private String batch;

    public String getSname() {
        return sname;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getBatch() {
        return batch;
    }

    public Student(String sname, Integer marks, String batch) {
        this.sname = sname;
        this.marks = marks;
        this.batch = batch;
    }
}

public class NissanTest {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("manu", 65, "A"),
                new Student("sanju", 51, "B"),
                new Student("kumar", 40, "A"));

         studentList.stream().filter(std -> std.getMarks() > 50)
                 .sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(student ->
                         System.out.println(student.getSname() + " - " + student.getMarks()));


        studentList.stream().collect(Collectors.groupingBy(Student::getBatch, Collectors.counting()))
                .entrySet().forEach(entry -> System.out.println(entry.getKey() +" - " +entry.getValue()));

        //SELECT * FROM STUDENT ST JOIN STUDENT_DETAILS STD ON ST.ID = STD.STUDENT_ID WHERE

    }
}

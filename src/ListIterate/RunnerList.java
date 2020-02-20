package ListIterate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student  {
    private int marks;
    private String name;
    private String dept;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(int marks, String name, String dept) {
        this.marks = marks;
        this.name = name;
        this.dept = dept;
    }

    public Student() {
    }
}

public class RunnerList {
    public static void main(String[] args){
        List<Student>studentList = null;
        Student s1 = new Student(30,"saurav","it");
        Student s2 = new Student(20,"monu","it");
        Student s3 = new Student(10,"sandeep","cs");
        studentList = Arrays.asList(s1,s2,s3);
        Stream<Integer> st = studentList.stream().filter(s -> s.getMarks()>10).map(Student::getMarks);
        System.out.println(st.findAny().map(e-> e.intValue()));
        /*Student msx = studentList.stream().min(Comparator.comparing(student -> student.getMarks())).orElseThrow(NoSuchElementException::new);
        List<Student> marks = studentList.stream().filter(i -> i.getMarks() > msx.getMarks()).collect(Collectors.toList());
        OptionalInt ret = marks.stream().mapToInt(i -> i.getMarks()).min();
        System.out.println(ret.getAsInt());*/
        /*studentList.forEach(p ->{
            List<Integer> marks = new ArrayList<>();
            if (p.getMarks()>msx.getMarks()){
                marks.add(p.getMarks());
            }Arrays.sort(marks.toArray());
            for (Integer a:marks){
                System.out.println(a.intValue());
            }
        });*/
       // System.out.println(marks);
    }
}

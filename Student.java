public class Student {
    int studentid;
    String name;
    String course;
    public Student(int studentid, String name, String course) {
        this.studentid = studentid;
        this.name = name;
        this.course = course;
    }
    void display(){
        System.out.println(studentid+" "+name+" "+course);
    }
    public static void main(String[] args) {
        Student s1 = new Student(100, "Ram", "Java");
        s1.display();
    }
}


package idea.src.Oopmethod;

public class ThisConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("tom", "tccs");
        System.out.println(s1.getName() + " " + s1.getSchoolName());
        Student s2 = new Student("jerry");
        System.out.println(s2.getName() + " " + s2.getSchoolName());
    }
}

class Student {
    private String name;
    private String SchoolName;

    public Student() {
    }

    public Student(String name) {
        this(name, "new school");// cunt super();
    }

    public Student(String name, String SchoolName) {
        // super();
        this.name = name;
        this.SchoolName = SchoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

}

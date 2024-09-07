package idea.src.txtends;

public class Student extends Teacher {

    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String name2, int age2) {
        super(name, age);
        name = name2;
        age = age2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void stedy() {
        System.out.println("study...");

    }

}

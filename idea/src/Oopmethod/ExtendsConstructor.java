package idea.src.Oopmethod;

public class ExtendsConstructor {
    public static void main(String[] args) {
        Teacher t = new Teacher("may", 29);
        // t.setName("marry");
        // t.setAge(25);
        System.out.println(t.getName() + " " + t.getAge());
    }
}

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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

}

class Teacher extends People {
    public Teacher(String name, int age) {
        super(name, age);
    }
}

package idea.src.Oopmethod;

public class StaticTest {
    public static void main(String[] args) {
        // static method just can access static things,cant access instance things(not
        // have static method)
        Student.university = "tccs";// for all Student object have same university "tccs",no need to set every
                                    // object,just set static university
        Student s1 = new Student();
        s1.age = 30;
        s1.name = "tom";
        // s1.university = "tccs";
        s1.show();// 30,tom,tccs

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "jerry";
        // s2.university = "tccs";
        s2.show();// 20,jerry,null(if no static university)//20,jerry,tccs(if static university)

    }
}

class Student {
    public String name;
    public int age;
    public static String university;

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}

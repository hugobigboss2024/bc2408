package idea.src.Oopmethod;

public class FinalTest {
    public static void main(String[] args) {
        final int age = 20;
        System.out.println(age);// 20
        // age = 100;// cant change final value int age
        final Student s = new Student();
        System.out.println(s.age);// 20 //no final
        s.age = 200; // can change final value in the Object
        System.out.println(s.age);// 200 //have final
        // s = new Student();//final object can't be changed object address,like a new
        // object

    }

}

class Student {
    public int age = 20;
}

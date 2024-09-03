package listofstudent;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArray2 {
    public static void main(String[] args) {
        ArrayList<Student2> arrayList = new ArrayList<Student2>();
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        for(int i = 0; i < arrayList.size(); i++) {
            Student2 s = arrayList.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        
    }
    public static void addStudent(ArrayList<Student2> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input name");
        String name = sc.nextLine();
        System.out.println("input age");
        String age = sc.nextLine();

        Student2 s = new Student2();
        s.setName(name);
        s.setAge(age);
        arrayList.add(s);
        ///////////////////////////////////////
        
    }
}

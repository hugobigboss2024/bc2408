package listofstudent;

import java.util.ArrayList;

public class StudentArray {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        
        Student s1 = new Student("apple", 12);
        Student s2 = new Student("banana", 15);
        Student s3 = new Student("orange", 18);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        


    }
   
}


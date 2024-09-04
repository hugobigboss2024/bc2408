package listofstudent;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentM {
    public static void main(String[] args) {
        ArrayList<StudentD> arrays = new ArrayList<StudentD>();
        while (true) {
            
        
        System.out.println("-----hello-----");
        System.out.println("1: add student");
        System.out.println("2: find student");
        System.out.println("3: delete student");
        System.out.println("4: update student");
        System.out.println("5: exit");
        System.out.println("please enter your choice");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        switch (line) {
            case "1":
            addStudent(arrays);    
                break;
            case "2":
            findStudent(arrays);    
                break;
            case "3":
            deleteStudent(arrays);   
                break;
            case "4":
            updateStudent(arrays);   
                break;
            case "5":
                
                //break;
                System.exit(0);

        }
    }
    }
    public static void addStudent(ArrayList<StudentD> arrays) {// max 91 method
    Scanner sc = new Scanner(System.in);
    String sid;//->51
    while (true) {
    
    System.out.println("input id");
    sid = sc.nextLine();// -> 65
    boolean flag =isUsed(arrays, sid);///!!!
    if(flag){
        System.out.println("id is used");
    }else{
        break;
    }
}
    System.out.println("input name");
    String sname = sc.nextLine();
    System.out.println("input age");
    String sage = sc.nextLine();
    System.out.println("input area");
    String sarea = sc.nextLine();

    StudentD s = new StudentD();
    s.setId(sid);//!!!
    s.setName(sname);
    s.setAge(sage);
    s.setArea(sarea);
    arrays.add(s);
    System.out.println("add success");
    }
    /*public static void addStudent(ArrayList<StudentD> arrays) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input id");
        String sid = sc.nextLine();
        System.out.println("input name");
        String sname = sc.nextLine();
        System.out.println("input age");
        String sage = sc.nextLine();
        System.out.println("input area");
        String sarea = sc.nextLine();
    
        StudentD s = new StudentD();
        s.setId(sid);
        s.setName(sname);
        s.setAge(sage);
        s.setArea(sarea);
        arrays.add(s);
        System.out.println("add success");
        }*/
    public static boolean isUsed(ArrayList<StudentD> arrays, String id){//check id isit used
        boolean flag = false;
        for(int i = 0; i < arrays.size(); i++){
            StudentD s = arrays.get(i);
            if(s.getId().equals(id)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void findStudent(ArrayList<StudentD> arrays){
    System.out.println("id\tname\tage\tarea");//!!!
    if(arrays.size() == 0){
        System.out.println("no data");
        return;
    }
    for(int i = 0; i < arrays.size(); i++){
        StudentD s = arrays.get(i);
        System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getArea());
    }
    }
    public static void  deleteStudent(ArrayList<StudentD> arrays){
    Scanner sc = new Scanner(System.in);
    System.out.println("input what id u want to del");
    String id = sc.nextLine();
    for(int i = 0; i < arrays.size(); i++){
        StudentD s = arrays.get(i);
        if(s.getId().equals(id)){
            arrays.remove(i);
            break;
        }
    }
    System.out.println("del success");
    }
    public static void updateStudent(ArrayList<StudentD> arrays){
    Scanner sc = new Scanner(System.in);
    System.out.println("input what id u want to update");
    String id = sc.nextLine();
    
    System.out.println("input new name");
    String name = sc.nextLine();
    System.out.println("input new age");
    String age = sc.nextLine();
    System.out.println("input new area");
    String area = sc.nextLine();
    
    StudentD s = new StudentD();
    s.setId(id);
    s.setName(name);
    s.setAge(age);
    s.setArea(area);
    for(int i = 0; i < arrays.size(); i++){
    StudentD ss = arrays.get(i);
    if(ss.getId().equals(id)){
        arrays.set(i, s);
        break;
    }
    }
    System.out.println("update success");
    }
    
}


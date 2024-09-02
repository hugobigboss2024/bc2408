package crew;

public class Crew {
    private String name;
    private int age;
    private char sex;
    private String position;
    private char department;
    
    public Crew() {
        System.out.println(" ");
    }
    public Crew(String name, int age, char sex, String position, char department) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
        this.department = department;
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
        if(age >= 0 && age <= 65){
            this.age = age;
        }else{
            System.out.println("byebye");
        }
        
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        if(sex == 'f' || sex == 'm' || sex == 'M' || sex == 'F'){
            this.sex = sex;
        }else{
            System.out.println("xxxxxxxxxxxx");
        }
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public char getDepartment() {
        return department;
    }
    public void setDepartment(char department) {
        if(department == 'c' || department == 'h'){
            this.department = department;
        }else{
            System.out.println("xxxxxxxxxxxxx" );
        }
    }
   
}

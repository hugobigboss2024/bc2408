package listofstudent;

public class StudentD {
    private String id;
    private String name;
    private String age;
    private String area;
    public StudentD() {
    }
    public StudentD(String id, String name, String age, String area) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.area = area;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}

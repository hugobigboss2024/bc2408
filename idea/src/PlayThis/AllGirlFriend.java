package idea.src.PlayThis;

public class AllGirlFriend {
  private String name;
  private int age;
  private String gender;

  public void setName(String name){
    this.name = name;
  }
  /*public void setAge(){
    int age = 10;
    System.out.println(age);//0
    System.out.println(this.age);//0
  }*/
  public void setAge(int age){
    //this.age = age;
    if(age >= 18 && age <= 50){
      this.age = age;
    }else{
      System.out.println("i dont want");
    }
  }
  public void setGender(String gender){
    this.gender = gender;
  }
  public String getName(){
    return this.name;
  }public int getAge(){
    return this.age;
  }
  public String getGender(){
    return this.gender;
  }
}

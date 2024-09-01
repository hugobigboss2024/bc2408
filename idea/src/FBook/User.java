package fbook;

public class User {
  private String username;
  private String password;
  private String email;
  private String gender;
  private int age;
//alt + insert
//alt + fn + insert 
  public User() {
  }
  public User(String username, String password, String email, String gender, int age) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
  }


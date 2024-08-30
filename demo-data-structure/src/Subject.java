import java.util.Objects;

public class Subject {
  private int score;
  private String desc;

  public Subject(int score, String desc) {
    this.score = score;
    this.desc = desc;
  }

  public int getScore() {
    return this.score;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Subject))
      return false;
    Subject subject = (Subject) obj;
    return Objects.equals(this.desc, subject.getDesc());
  }

  @Override
  public String toString() {
    return "Subject(" //
        + "score=" + this.score //
        + ", description=" + this.desc //
        + ")";
  }

}
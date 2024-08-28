import java.time.LocalDate;
import java.util.Objects;
public class Airplane {
  private String model;
  private LocalDate completionDate;

  public Airplane(String model, LocalDate completionDate) {
    this.model = model;
    this.completionDate = completionDate;
  }

  public String getModel() {
    return this.model;
  }

  public LocalDate getCompletionDate() {
    return this.completionDate;
  }

  @Override
  public String toString() {
    return "Airplane(" //
        + "model=" + this.model //
        + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Airplane))
      return false;
    Airplane airplane = (Airplane) obj;
    return Objects.equals(this.model, airplane.getModel()) //
        && Objects.equals(this.completionDate, airplane.getCompletionDate()) //
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.model, this.completionDate);
  }

  public static void main(String[] args) {
    System.out
        .println(new Airplane("Boeing 747", LocalDate.of(2023, 8, 30)).equals(null)); 
    System.out.println(new Airplane("Boeing 747", LocalDate.of(2024, 1, 1))
        .equals(new Airplane("Boeing 747", LocalDate.of(2023, 8, 30)))); 
    
    System.out.println(new Airplane("Boeing 747", LocalDate.of(2023, 8, 30)).hashCode()); 
   }
}


import java.time.LocalDate;
import java.util.Objects;
public class Test6 {
    private String name;
    private LocalDate toDay;

    public Test6(String name, LocalDate toDay){
        this.name = name;
        this.toDay = toDay;
    }
    public String getName(){
        return this.name;
    }
    public LocalDate getToDay(){
        return this.toDay;
    }
    @Override
    public String toString(){//!!
        return "Test6(" + "name=" + this.name + ")";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Test6))
        return false;
        Test6 test6 = (Test6) obj;
        return Objects.equals(this.name, test6.getName())//
        &&Objects.equals(this.toDay, test6.getToDay());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.toDay);
    }
}

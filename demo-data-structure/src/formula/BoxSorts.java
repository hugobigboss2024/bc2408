package formula;

public class BoxSorts {

    private BoxSorts() {}
  
    // retrun interface type
    public static BoxSort ofAsc() {
      return new BoxSortByIntAsc();
    }
  
    public static BoxSort ofDesc() {
      return new BoxSortByIntDesc();
    }
  }
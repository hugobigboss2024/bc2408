public class Cars {

    //创建一个 Car 类，包含以下属性：make（品牌）、model（型号）、year（年份）和 mileage（里程）。为该类编写一个方法，输出该车的详细信息。
private String make;
private String model;
private Integer year;
private Double mileage;

public Cars(String make, String model, Integer year, Double mileage){
    this.make = make;
    this.model = model;
    this.year = year;
    this.mileage = mileage;
}
public String getMake(){
    return this.make;
}
public String getModel(){
    return this.model;
}
public Integer getYear(){
    return this.year;
}
public void displayDetails(){
    String nn = "Car Details";
    System.out.println(nn);
    System.out.println("make:" + make);
    System.out.println("model:" + model);
    System.out.println("year:" +(year != null ? year : "N/A"));
    //System.out.println("mileage:" +  (mileage != 0.0 ? mileage : "N/A") + "mileage");
    System.out.println("Mileage: " + (mileage != null ? mileage : "N/A") + " miles");
}
public static void main(String[] args) {
    Cars car = new Cars("BMW", "a001", 2020, 10000.0);
    car.displayDetails();
    //System.out.println(car.displayDetails());
    Cars car2 = new Cars("MiMi", "mm02", null, null);
    //System.out.println(car2.displayDetails());

}

}
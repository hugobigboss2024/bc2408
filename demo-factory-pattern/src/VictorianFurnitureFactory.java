public class VictorianFurnitureFactory implements FurnitureFactory {
  // @Override
  // public Chair createChair() {
  // System.out.println("VictorianFurnitureFactory creating Chair ...");
  // return new VictorianChair();
  // }

  // @Override
  // public Sofa createSofa() {
  // System.out.println("VictorianFurnitureFactory creating Sofa ...");
  // return new VictorianSofa();
  // }
  public Furniture create(Type type) {
    switch (type) {// 根据 type 的不同值来选择要创建的家具类型
      case CHAIR:
        return new VictorianChair();
      case SOFA:
        return new VictorianSofa();
    }
    throw new RuntimeException("Furniture Type Not Found.");
  }
}
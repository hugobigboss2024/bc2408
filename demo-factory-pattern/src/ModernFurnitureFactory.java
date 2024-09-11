public class ModernFurnitureFactory implements FurnitureFactory {
  // @Override
  // public Chair createChair() {
  // System.out.println("ModernFurnitureFactory creating Chair ...");
  // return new ModernChair();
  // }

  // @Override
  // public Sofa createSofa() {
  // System.out.println("ModernFurnitureFactory creating Sofa ...");
  // return new ModernSofa();
  // }

  public Furniture create(Type type) {
    switch (type) {// 根据 type 的不同值来选择要创建的家具类型
      case CHAIR:
        return new ModernChair();
      case SOFA:
        return new ModernSofa();
    }
    throw new RuntimeException("Furniture Type Not Found.");
  }

}
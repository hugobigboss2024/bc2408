# 在這個家具管理系統中，以下 14 個類和接口之間的關係和運作如下：

## 1. Furniture (抽象類)
作用：
作為所有具體家具類（如 Chair 和 Sofa）的基類，定義了家具的基本屬性和行為。
關係：
其他具體家具類（如 ModernChair、VictorianChair、ModernSofa 和 VictorianSofa）會繼承這個抽象類，並實現其抽象方法。
## 2. Chair (抽象類)
作用：
繼承自 Furniture，表示椅子這一特定類型的家具。
關係：
ModernChair 和 VictorianChair 這兩個具體類繼承自 Chair，並實現其方法。
## 3. Sofa (抽象類)
作用：
繼承自 Furniture，表示沙發這一特定類型的家具。
關係：
ModernSofa 和 VictorianSofa 這兩個具體類繼承自 Sofa，並實現其方法。
## 4. ModernChair (具體類)
作用：
實現 Chair，表示現代風格的椅子，包含特定的屬性和行為。
關係：
繼承自 Chair，並繼承 Furniture 的基本屬性和行為。
## 5. VictorianChair (具體類)
作用：
實現 Chair，表示維多利亞風格的椅子，包含特定的屬性和行為。
關係：
繼承自 Chair，並繼承 Furniture 的基本屬性和行為。
## 6. ModernSofa (具體類)
作用：
實現 Sofa，表示現代風格的沙發，包含特定的屬性和行為。
關係：
繼承自 Sofa，並繼承 Furniture 的基本屬性和行為。
## 7. VictorianSofa (具體類)
作用：
實現 Sofa，表示維多利亞風格的沙發，包含特定的屬性和行為。
關係：
繼承自 Sofa，並繼承 Furniture 的基本屬性和行為。
## 8. FurnitureFactory (接口)
作用：
定義了一個工廠方法 create(Type type)，用於創建家具對象。
關係：
ModernFurnitureFactory 和 VictorianFurnitureFactory 兩個具體工廠實現了這個接口，並提供具體的家具創建邏輯。
## 9. ModernFurnitureFactory (具體工廠)
作用：
實現 FurnitureFactory 接口，專門用於創建現代風格的家具。
關係：
根據傳入的 Type 來創建具體的 ModernChair 或 ModernSofa 對象。
## 10. VictorianFurnitureFactory (具體工廠)
作用：
實現 FurnitureFactory 接口，專門用於創建維多利亞風格的家具。
關係：
根據傳入的 Type 來創建具體的 VictorianChair 或 VictorianSofa 對象。
## 11. Type (枚舉)
作用：
定義家具的類型，包括 CHAIR 和 SOFA。
關係：
用於在 FurnitureFactory 和 Inventory 中指示要創建或查詢的家具類型。
## 12. Style (枚舉)
作用：
定義家具的風格，包括 MODERN 和 VICTORIAN。
關係：
用於在 Inventory 中指示要添加的家具風格，並在 FurnitureFactory 中選擇相應的工廠。
## 13. Inventory (類)
作用：
管理家具的集合，提供添加、查詢數量和獲取所有家具的方法。
關係：
使用 FurnitureFactory 創建具體的家具對象，並存儲在 furnitures 列表中。
## 14. CheckoutManager (類)作用：
負責計算購物車中家具的總金額。
關係：
使用 Inventory 中的家具列表來計算總金額，並演示如何使用家具工廠和庫存。
#
## class: CheckoutManager
### CheckoutManager 類負責計算總金額，並管理購物車中的家具。
## totalAmount(List<Furniture> furnitures) 方法
### 此方法接收一個 Furniture 對象的列表，計算並返回所有家具的總價格。
### 使用一個 for 循環遍歷 furnitures 列表，調用每個 Furniture 對象的 getPrice() 方法，將其價格累加到 total 變量中。
### 最後返回總金額。
## main 方法是程序的入口點，演示了如何使用 Inventory 和 CheckoutManager 來管理和計算家具的總金額。
### 創建家具工廠：設定風格為 MODERN，並使用 FurnitureFactory.of(style) 獲取相應的工廠實例。
### 創建家具：通過工廠創建一個 CHAIR 對象（雖然這個對象沒有被使用）。
### 管理庫存：創建一個 Inventory 實例，並使用 add 方法添加不同風格和類型的家具到庫存中。
### 查詢數量：使用 getQuantity(Type.SOFA) 和 getQuantity(Type.CHAIR) 方法查詢庫存中沙發和椅子的數量，並打印出來。
### 計算總金額：創建一個 CheckoutManager 實例，並使用 totalAmount(inventory.getFurnitures()) 方法計算庫存中所有家具的總金額，然後打印該金額。

## enum: Type
### 類型, Type 是一個枚舉（enum），用於定義家具的類型，包括 CHAIR 和 SOFA。這樣可以統一管理和使用這些類型
#### Type 枚舉與 Furniture 類的 isTypeOf(Type type) 方法相關聯，用於判斷某個家具是否屬於特定類型。
#### 在 Inventory 類中，getQuantity(Type type) 方法使用 Type 來計算特定類型的家具數量。

## enum: Style
### 樣式, tyle 也是一個枚舉（enum），定義了家具的風格，包括 MODERN 和 VICTORIAN。這提供了一種靈活的方式來識別和管理不同風格的家具。
#### Style 枚舉與 FurnitureFactory 的 of(Style style) 方法相關聯，根據所選風格返回相應的家具工廠。
#### 在 Inventory 類中，add(Style style, Type type) 方法使用 Style 來添加具有特定風格和類型的家具。

## abstract class: Sofa~(extends)Furniture 不能直接new object
### Sofa 是一個抽象類，繼承自 Furniture，表示沙發這一特定類型的家具。
### 此類可以包含沙發特有的屬性和行為，但目前沒有具體實現。
#### Sofa 作為 Furniture 的子類，擴展了家具的基本行為，並將在具體的實現類中定義具體屬性和行為（如 ModernSofa 或 VictorianSofa）。

## abstract class: Chair~(extends)Furniture 不能直接new object
### Chair 是一個抽象類，繼承自 Furniture，表示椅子這一特定類型的家具。
### 此類可以包含椅子特有的屬性和行為，但目前沒有具體實現。
#### Chair 作為 Furniture 的子類，擴展了家具的基本行為，並將在具體的實現類中定義具體屬性和行為（如 ModernChair 或 VictorianChair）。

## abstract class: Furniture !!! 不能直接new object
### Furniture 抽象類表示家具的基本特徵，包含價格和檢查類型的方法。
### 它定義了兩個抽象方法：hasLegs() 和 sitOn()，這些方法必須在具體家具類中實現。
#### Furniture 作為所有具體家具類（如 Chair 和 Sofa）的基類，提供了共同的屬性和行為。
#### FurnitureFactory 會返回 Furniture 的具體實現，而 Inventory 則管理這些 Furniture 對象。

## interface: FurnitureFactory !!!
### FurnitureFactory 接口定義了一個創建家具的工廠方法 create(Type type)，用於根據家具類型生成相應的家具對象。
### 它還定義了一個靜態方法 of(Style style)，根據風格返回具體的工廠實現。
#### FurnitureFactory 接口的具體實現（如 ModernFurnitureFactory 和 VictorianFurnitureFactory）將負責實際創建家具對象。
#### Inventory 類使用這個工廠來生成特定風格的家具。

## class: Inventory !!!
### 管理一個家具的集合。它提供了增加家具、獲取家具列表和計算特定類型家具數量的功能。
#### Inventory 類包含一個 List<Furniture>，用於存儲所有的家具對象。
#### 它通過 FurnitureFactory 來創建 Furniture 對象，使用 add 方法將新家具添加到庫存中。

## class: ModernChair~(extends)Chair
### ModernChair 類是 Chair 的具體實現，表示現代風格的椅子。
### 包含一個 price 屬性，通過 readFromDB() 方法從數據庫中讀取價格。
#### ModernChair 繼承自 Chair，因此它具備 Furniture 的基本屬性和行為。
#### 重寫了 getPrice()、hasLegs() 和 sitOn() 方法，提供椅子的具體實現。
#### ModernFurnitureFactory 可以使用 create(Type type) 方法來創建 ModernChair 對象。

## class: ModernFurnitureFactory~(implements)FurnitureFactory
### ModernFurnitureFactory 類實現了 FurnitureFactory 接口，專門用於創建現代風格的家具。
### 它的 create(Type type) 方法根據傳入的類型返回相應的家具對象（如 ModernChair 或 ModernSofa）。
#### ModernFurnitureFactory 根據 Type 類型來創建具體的家具對象，協調 ModernChair 和 ModernSofa 的實例化。
#### Inventory 類可以使用這個工廠來添加現代家具。

## class: ModernSofa~(extends)Sofa
### ModernSofa 類是 Sofa 的具體實現，表示現代風格的沙發。
### 它包含一個 price 屬性，通過 readFromDB() 方法從數據庫中讀取價格。
#### ModernSofa 繼承自 Sofa，因此它具有 Furniture 的基本屬性和行為。
#### 重寫了 getPrice()、hasLegs() 和 sitOn() 方法，提供沙發的具體實現。
#### ModernFurnitureFactory 可以使用 create(Type type) 方法來創建 ModernSofa 對象。

## class: VictorianChair~(extends)Chair
### VictorianChair 類是 Chair 的具體實現，表示維多利亞風格的椅子。
### 包含一個 price 屬性，通過 readFromDB() 方法從數據庫中讀取價格，並重寫了 getPrice() 方法以返回該價格。
#### VictorianChair 繼承自 Chair，因此它擁有 Furniture 的基本屬性和行為。
#### 重寫了 hasLegs() 和 sitOn() 方法，提供椅子的具體實現。
#### VictorianFurnitureFactory 可以使用 create(Type type) 方法來創建 VictorianChair 對象。

## class: VictorianFurnitureFactory~(implements)FurnitureFactory
### VictorianFurnitureFactory 類實現了 FurnitureFactory 接口，專門用於創建維多利亞風格的家具。
### 它的 create(Type type) 方法根據傳入的類型返回相應的家具對象（如 VictorianChair 或 VictorianSofa）。
#### VictorianFurnitureFactory 根據 Type 類型來創建具體的家具對象，協調 VictorianChair 和 VictorianSofa 的實例化。
#### Inventory 類可以使用這個工廠來添加維多利亞風格家具。

## class: VictorianSofa~(extends)Sofa
### VictorianSofa 類是 Sofa 的具體實現，表示維多利亞風格的沙發。
### 它包含一個 price 屬性，通過 readFromDB() 方法從數據庫中讀取價格，並重寫了 getPrice() 方法以返回該價格。
#### VictorianSofa 繼承自 Sofa，因此它擁有 Furniture 的基本屬性和行為。
#### 重寫了 hasLegs() 和 sitOn() 方法，提供沙發的具體實現。
#### VictorianFurnitureFactory 可以使用 create(Type type) 方法來創建 VictorianSofa 對象。

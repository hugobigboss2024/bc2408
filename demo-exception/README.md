## Exception

### What is unchecked exception?
- You don't have to handle the excetpion by "try catch" or "rethrow"
- You can ignore the potential exception scenario (refer to ExceptionChainExample1.java)
- You can recover as well.

### What is checked exception?
- Create custom class (extends Exception.class)
- You have to handle the exception by 2 ways:
  - "Try Catch"
  - "re-throw by method signature"
- Refer to BusinessException.java

### Unchecked Exception (Run-time Exception)
- / by zero, NPE, IAE, IndexOutOfBound, etc. (Likely Memory Limitation)

### Checked Exception (Compile-time Exception)
- IOException (DB login, Server service unavailable, File Access, File Not Found, etc)
- Custom Exception

### Why do we need Exception?
- The world without Exception, you can only use "return" for method communication
  - return -> Happy Path
- The world with Exception, you can both use "return" and "throw"


＃＃ 例外

### 什麼是未檢查異常？
- 你不必透過「嘗試捕捉」或「重新拋出」來處理異常
- 可以忽略潛在的異常場景（參考ExceptionChainExample1.java）
- 你也可以康復。

### 什麼是檢查異常？
- 建立自訂類別（擴展Exception.class）
- 您必須透過兩種方式處理異常：
 - “嘗試捕捉”
 - “通過方法簽名重新拋出”
- 參考 BusinessException.java

### 未經檢查的異常（運行時異常）
- / by zero、NPE、IAE、IndexOutOfBound 等（可能是記憶體限制）

### 檢查異常（編譯時異常）
- IOException（資料庫登入、伺服器服務不可用、檔案存取、檔案未找到等）
- 自訂異常

### 為什麼我們需要異常？
- 世界無例外，方法通訊只能使用“return”
 - 返回 -> 快樂之路
- 有異常的世界，你可以同時使用“return”和“throw”
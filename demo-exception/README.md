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
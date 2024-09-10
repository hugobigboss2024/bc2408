## Exception

### What is unchecked exception?
- You don't have to handle the excetpion by "try catch" or "rethrow"
- You can ignore the potential exception scenario (refer to ExceptionChainExample1.java)

### What is checked exception?
- Create custom class (extends Exception.class)
- You have to handle the exception by 2 ways:
  - "Try Catch"
  - "re-throw by method signature"

### Unchecked Exception (Run-time Exception)
- / by zero, NPE, IAE, IndexOutOfBound, etc.

### Checked Exception (Compile-time Exception)
- IOException (DB login, Server service unavailable, File Access, File Not Found, etc)

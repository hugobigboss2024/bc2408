## Data Structure

- HashMap vs List
  - HashMap.get() by key -> for loop list, if value = key, return the object
    - HashMap<String, String> urlMap (i.e. "AAPL", "www.apple.com")
    - If we want to store more info about the "key" -> HashMap<String, Company>
    - Retain key object is wrapper class or String (equals(), hashCode() is ready)
  - HashMap<Customer, List<Transaction>>
    - If key is custom object, be careful of equals() and hashCode() -> put(), get()
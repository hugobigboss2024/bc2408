package enum.src;

public enum Weekday {
  MON, TUE, WED, THU, FRI,;

  public static void main(String[] args) {
    Weekday[] weekdays = new Weekday[] {MON, FRI, WED, MON};
    for (Weekday weekday : weekdays) {
      if (weekday == MON) { // "==" checking address
        // do something on Monday
      }
    }
  }
}


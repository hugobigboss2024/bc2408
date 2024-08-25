package cl_object.src;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class D_LocalDate {
  public static void main(String[] args) {
  // 2024-08-30
    // 2024-08-31

    LocalDate date = LocalDate.of(2024, 8, 30);
    System.out.println(date); // 2024-08-30
    System.out.println(date.plusMonths(3)); // 2024-11-30, return new object
                                            // (not revise itself)
    System.out.println(date);
    System.out.println(date.plusDays(90)); // 2024-11-28

    LocalDate yearEnd = LocalDate.of(2024, 12, 31);
    System.out.println(yearEnd.plusDays(1)); // 2025-01-01

    DayOfWeek dow = date.getDayOfWeek(); // DayOfWeek Object
    System.out.println(dow); // FRIDAY

    // !!! always use eqauls() and compareTo() for non-primitives
    if (date.getDayOfWeek().equals(DayOfWeek.of(5))) {
      System.out.println("Its Friday");
    }
    // !!! Normally, "==" is checking if they are same object/address
    // enum
    if (date.getDayOfWeek() == DayOfWeek.of(5)) {
      System.out.println("Its Friday");
    }

    System.out.println(date.compareTo(LocalDate.of(2024, 8, 29))); // 1
    System.out.println(date.compareTo(LocalDate.of(2024, 8, 30))); // 0
    System.out.println(date.compareTo(LocalDate.of(2024, 9, 1))); // -1

    LocalDate[] dates = new LocalDate[] {LocalDate.of(2024, 02, 28) //
        , LocalDate.of(2024, 2, 28)//
        , LocalDate.of(2024, 7, 30) //
        , LocalDate.of(2025, 1, 1)};
    // Find Max date
    LocalDate maxDate = LocalDate.of(1, 1, 1);
    for (LocalDate d : dates) {
      if (d.compareTo(maxDate) > 0)
        maxDate = d; // change object
    }
    // for (int i = 0; i < dates.length; i++) {
    // if (dates[i].compareTo(maxDate) > 0)
    // maxDate = dates[i];
    // }
    System.out.println(maxDate); // 2025-01-01
    dates[3] = LocalDate.of(2026, 1, 1);
    System.out.println(Arrays.toString(dates)); // [2024-02-28, 2024-02-28,
                                                // 2024-07-30, 2026-01-01]
    System.out.println(maxDate); // 2025-01-01

    // LocalDate, String, BigDecimal -> immutable
    // "Immutable" -> the object has no method to revise itself

    
  }
}

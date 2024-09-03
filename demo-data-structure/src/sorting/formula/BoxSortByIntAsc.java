package sorting.formula;

import sorting.Box;

public class BoxSortByIntAsc implements BoxSort {
  @Override
  public int compare(Box b1, Box b2) {
    // b1 (-1), b2 (1)
    return b1.getValue() < b2.getValue() ? -1 : 1;
  }
}

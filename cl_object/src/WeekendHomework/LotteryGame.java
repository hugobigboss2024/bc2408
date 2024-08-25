package cl_object.src.WeekendHomework;

public class LotteryGame {//need 1-49//6 number arr[]??//
  // Static final variable
  private static final int MAX_NUMBERS = 49;
  // Static variable
  private static int totalPlayers = 0;//maybe no need this??
  // Final variable
  private final int playerNumber;//6
  // Non-static, non-final variable
  private int[] selectedNumbers;//buy
  ////////////////////////////////////////////////
  public LotteryGame() {// Constructors
    playerNumber = ++totalPlayers;
      selectedNumbers = new int[6];
  }
  public LotteryGame(int[] numbers) {
    playerNumber = ++totalPlayers;
      selectedNumbers = numbers;
  }
  public void pickNumbers() {// Instance methods
      for (int i = 0; i < selectedNumbers.length; i++) {
          selectedNumbers[i] = (int) (Math.random() * MAX_NUMBERS) + 1;}
  }
  public int calculatePrize() {
      int matches = 0;
      int[] winningNumbers = drawWinningNumbers();
      for (int number : selectedNumbers) {
          for (int winningNumber : winningNumbers) {
              if (number == winningNumber) {
                  matches++;
              }
          }
      }return getPrizeAmount(matches);//
  }// Static methods
  private static int[] drawWinningNumbers() {// Static methods
      int[] winningNumbers = new int[6];
      for (int i = 0; i < winningNumbers.length; i++) {
          winningNumbers[i] = (int) (Math.random() * MAX_NUMBERS) + 1;
      }return winningNumbers;
  }
  
}

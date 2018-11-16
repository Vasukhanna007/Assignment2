import java.util.Arrays;

public class TesterA3 {

 public static void main(String[] args) {
  System.out.println("*************Test CountdownDays*************");
  System.out.println();
  
  testCountdownDays();
  
  System.out.println();
  System.out.println("*************Test GuessTheWord*************");
  System.out.println();
  
  testGuessTheWord();
  
 }
 
 public static void testCountdownDays() {
  String substring = CountdownDays.getSubstring("strawberry", 0, 4);
  System.out.println("getSustring compiles. Output: " + substring);
  System.out.println();
  
  int day = CountdownDays.getDay("04/09/2034");
  int month = CountdownDays.getMonth("04/09/2034");
  int year = CountdownDays.getYear("04/09/2034");
  System.out.println("getDay, getMonth, getYear compile. Outputs: " + day + ", " + month + ", " + year);
  System.out.println();
  
  boolean isLeap = CountdownDays.isLeapYear(2100);
  System.out.println("isLeapYear compiles. Output: " + isLeap);
  System.out.println();
  
  int days = CountdownDays.getDaysInAMonth(2, 2018);
  System.out.println("getDaysInAMonth compiles. Output: " + days);
  System.out.println();
  
  boolean passed = CountdownDays.dueDateHasPassed("23/01/2002", "12/04/1998");
  System.out.println("dueDateHasPassed compiles. Output: " + passed);
  System.out.println();
  
  int daysLeft = CountdownDays.countDaysLeft("12/04/1998", "23/01/2002");
  System.out.println("countDaysLeft compiles. Output: " + daysLeft);
  System.out.println();
  
  CountdownDays.displayCountdown("23/01/2002");
  System.out.println("displayCountdown compiles");
  System.out.println();
 }
 
 public static void testGuessTheWord() {
  boolean valid = GuessTheWord.isValidGuess('g');
  System.out.println("isValidGuess compiles. Output: " + valid);
  System.out.println();
  
  int[] guesses = GuessTheWord.generateArrayOfGuesses("pineapple");
  System.out.println("generateArrayOfGuesses compiles. Output: " + Arrays.toString(guesses));
  System.out.println();
  
  boolean passed = GuessTheWord.checkAndUpdate("pineapple", guesses, 't');
  System.out.println("checkAndUpdate compiles. Output: " + passed);
  System.out.println();
  
  String word = GuessTheWord.getWordToDisplay("pineapple", guesses, 'p');
  System.out.println("getWordToDisplay compiles. Output: " + word);
  System.out.println();
  
  boolean guessed = GuessTheWord.isWordGuessed(guesses);
  System.out.println("isWordGuessed compiles. Output: " + guessed);
  System.out.println();
  
 }
 

}

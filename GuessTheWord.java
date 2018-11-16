//Fill in your name and student number
//Name: Vasu Khanna
//Student Number: 260831350

// do NOT touch the following import statement
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class GuessTheWord {
  
  private static final String[] words = {"perfect", "country", "pumpkin", "special", "freedom", "picture", "husband", 
    "monster", "seventy", "nothing", "sixteen", "morning", "journey", "history", "amazing", "dolphin", "teacher", 
    "forever", "kitchen", "holiday", "welcome", "diamond", "courage", "silence", "someone", "science", "revenge", 
    "harmony", "problem","awesome", "penguin", "youtube", "blanket", "musical", "thirteen", "princess", "assonant", 
    "thousand", "language", "chipotle", "business", "favorite", "elephant", "children", "birthday", "mountain", 
    "football", "kindness", "abdicate", "treasure", "strength", "together", "memories", "darkness", "sandwich", 
    "calendar", "marriage", "building", "function", "squirrel", "tomorrow", "champion", "sentence", "daughter", 
    "hospital", "identical", "chocolate", "beautiful", "happiness", "challenge", "celebrate", "adventure", 
    "important", "consonant", "dangerous", "irregular", "something", "knowledge", "pollution", "wrestling", 
    "pineapple", "adjective", "secretary", "ambulance", "alligator", "congruent", "community", "different", 
    "vegetable", "influence", "structure", "invisible", "wonderful", "nutrition", "crocodile", "education", 
    "beginning", "everything", "basketball", "weathering", "characters", "literature", "perfection", "volleyball", 
    "homecoming", "technology", "maleficent", "watermelon", "appreciate", "relaxation", "abominable", "government", 
    "strawberry", "retirement", "television", "silhouette", "friendship", "loneliness", "punishment", "university", 
    "confidence", "restaurant", "abstinence", "blackboard", "discipline", "helicopter", "generation", "skateboard", 
    "understand", "leadership", "revolution"};  
  
  // this method takes an integer as input and returns a radom String from the array above. 
  // you can use it, but do NOT modified neither the method NOR the above array. 
  public static String getRandomWord(int seed) {
    Random gen = new Random(seed);
    int randomIndex = gen.nextInt(words.length);
    return words[randomIndex];
  }
  
  //========================
  // Enter your code below
  
  public static void main(String[] args) {
    //System.out.println(isValidGuess('g')); 
//    String s = "pineapple";
//    System.out.println(Arrays.toString(generateArrayOfGuesses(s)));
//    int [] guesses = generateArrayOfGuesses(s);
//    System.out.println(checkAndUpdate(s,guesses,'e'));
//    System.out.println(Arrays.toString(guesses));
//    
//    
//    
//    System.out.println(getWordToDisplay(s, guesses, 'e'));
//    System.out.println(getWordToDisplay(s, guesses, 'i'));
//    
//    System.out.println(getWordToDisplay(s, guesses, 'n'));
//    
//    System.out.println(getWordToDisplay(s, guesses, 'a'));
//    
//    System.out.println(getWordToDisplay(s, guesses, 'p'));
//    
//    
//    
//    System.out.println(isWordGuessed(guesses));
    play(1234);
    
  }
// a   
  public static boolean isValidGuess(char c){
    if(c>='a'&&c<='z'){
      return true;
      
    }
    return false;
    
    
  } 
  //b
  public static int[] generateArrayOfGuesses(String wordTobeGuessed){
    int[] guesses = new int[wordTobeGuessed.length()];
    return guesses;
  }
  //c
  public static boolean checkAndUpdate(String secretWord,int[] nathu,char c){
    int[]checkAndUpdate= nathu;
    int i = secretWord.length();
    
    for (int j=0;j<i;j++){
      if(secretWord.charAt(j)== c){
        checkAndUpdate [j]=1;
        
      }
      
      
    }
    for (int j=0;j<i;j++){
      if (secretWord.charAt(j)== c){
        return true;
      }
      
    }
    return false;
  }
  
  
  //d
  public static String getWordToDisplay(String secretWord, int[] sham, char lastGuess){
    String empty = "" ; 
    for(int i = 0 ; i<secretWord.length() ; i++){
      if(secretWord.charAt(i)== lastGuess){
        empty+= Character.toUpperCase(lastGuess);
      }
      else if (sham[i]==1){
        empty+=secretWord.charAt(i);
      }
      else{
        empty+= "-"; 
        
      }
      
    }
    return empty;
    
  }
//e 
  public static boolean isWordGuessed(int[]arr){
    for (int j=0;j<arr.length;j++){
      if(arr[j]==0){
        return false;
        
      }
      
    }
    return true;
  }
//f
  
  public static void play(int n){
    String randomWord= getRandomWord(n); 
   //p String[] guessWord =new String[randomWord.length()];
    int[] arr = new int[randomWord.length()] ;
    int lives=10;
    String guessChar;
    
    
    
    Scanner read = new Scanner(System.in);
    
    System.out.println("Welcome to Guess the world!\" ");
    
    System.out.println(" Your secret word has been generated. It has " +  randomWord.length() + " characters. You have 10 lives. Good luck! " );
    
    while(lives!=0){
      
      System.out.print("You have "+lives+ " lives left.Please enter a character :");
      guessChar = read.nextLine();
      
      
      
      if(guessChar.length()==1){
        char c = guessChar.charAt(0);
        
        if(Character.isUpperCase(c)){
          System.out.println("The character must be a lower case letter of english alphabet!");
        }
        else if(!isValidGuess(c)){
          System.out.println("Plese input a valid character. Try again!");
          
        }
        else if(!checkAndUpdate( randomWord,arr, c)){
          System.out.println("There's no such character. Try again!");
          lives --;
          
        }
        else{
          System.out.println("Great job! the secret word contains letter '"+guessChar + " '");
          
          
          
        }
        String s=getWordToDisplay(randomWord, arr, c);
        if(randomWord.toUpperCase().equals(s.toUpperCase())){
          System.out.println(s);
          System.out.println("Congratulations you guessed the secret word");
          break;
          
        }
        
        System.out.println(s);
        
        
        
      }
      else{
        System.out.println("You can only enter one single character. Try again!");
        
      }
      
    }
    if (lives==0)
      System.out.println("You have no life left, better luck next time! the secret was : " + " \"" + randomWord + "\"");
    
    
    
    
  }
}













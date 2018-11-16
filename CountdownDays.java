//Fill in your name and student number
//Name: Vasu Khanna
//Student Number: 260831350

// do NOT touch these import statements 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class CountdownDays {
  
  // the method returns a String representing the current date in the following format: dd/mm/yyyy
  // you can use it, but do NOT modify it!
  public static String getCurrentDate() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    LocalDateTime now = LocalDateTime.now();  
    return dtf.format(now);
  }
  
  //========================
  // Enter your code below
  
  public static void main(String[] args) {
    System.out.println(getSubstring("Strawberry",0,4));
    System.out.println(getDay("04/09/2034"));
    System.out.println(getMonth("04/09/2034"));
    System.out.println(getYear("04/09/2034"));
    System.out.println(isLeapYear(2021));
    System.out.println(getDaysInAMonth(2,1992));
    System.out.println(dueDateHasPassed("23/01/2002","12/04/1998"));
    System.out.println(countDaysLeft("30/10/2018","07/11/2018"));
    displayCountdown("31/10/2019");
  }
  
  // a  
  public static String getSubstring(String s,int i,int j){
    if(i>j){
      throw new IllegalArgumentException("put appropriate input");
      
    }
    
    
    String p = "";
    // creating a empty string
    for(int k=i;k<=j;k++){
      p = p + s.charAt(k); 
      
      
    }
    return p;
    
  }//b
  public static int getDay(String date){
    String a = getSubstring(date,0,1);
    int dateToday = Integer.parseInt(a);
    return dateToday;
  }
  public static int getMonth(String date){
    String a = getSubstring(date,3,4);
    int monthToday = Integer.parseInt(a);
    return monthToday;
  }
  public static int getYear(String date){
    String a = getSubstring(date,6,9);
    int  yearToday = Integer.parseInt(a);
    return yearToday;
  }
  //c
  public static boolean isLeapYear(int year){
    
    boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    if(LeapYear){
      return LeapYear;
    }
    return false;
  } //d
  public static int getDaysInAMonth(int month,int year){
    int days=0;
    int m=year;
    int dayz=0;
    if(isLeapYear(year)==true){
      dayz=29;
    }
    else
      dayz=28;
    
    switch (month) {
      case 1:  days = 31;
      break;
      case 2: days = dayz ;
      break;
      case 3: days = 31;
      break;
      case 4: days = 30;
      break;
      case 5: days = 31;
      break;
      case 6: days = 30;
      break;
      case 7: days =31;
      break;
      case 8: days =31;
      break;
      case 9: days = 30;
      break;
      case 10:days = 31;
      break;
      case 11:days = 30;
      break;
      case 12:days =31;
      break;
      
    }
    
    
    return days;
  }
  //e
  public static boolean dueDateHasPassed(String now, String due){
    if (getYear(due)>getYear(now)){
      return false;
    }
    else if(getYear(due)>=getYear(now)&&getMonth(due)>getMonth(now))
    {
      return false;
    }
    
    else if(getYear(due)>=getYear(now)&&getMonth(due)>=getMonth(now)&&getDay(due)>getDay(now))
    {
      return false;
    }
    
    else{ 
      return true;
    }
  }
  //f
// 
  public static int countDaysLeft(String current, String due){
    int countDays=0;
    if (dueDateHasPassed(current, due)==true){
      return 0;
    }
    else {
      if((getYear(due)-getYear(current))==0){
        if (isLeapYear(getYear(current))){
          countDays -= 366;
        } else{
          countDays -= 365;}
      }
      else{
        for(int i=(getYear(current)+1); i<getYear(due);i++){
          if (isLeapYear(i)){
           countDays += 366;
          } else{
            countDays += 365;}}
      }
      
      //  month -starting part
      for(int j=getMonth(current)+1; j<=12; j++){
        int i = getYear(current);
         countDays += getDaysInAMonth( j,  i);  
      }
      // month -ending part
      for(int j=1; j<getMonth(due); j++){
        int i = getYear(due);
         countDays += getDaysInAMonth( j,  i); 
      }
      // start day
      int month = getMonth(current);
      int year = getYear(current);
      countDays += (getDaysInAMonth( month,  year)-getDay(current)); 
      
      // end days
      countDays += getDay(due); 
    }
    return  countDays;
  }  
  
  
  
  //g 
  public static void displayCountdown(String dueD){
    String curr=getCurrentDate();
    String dueDate=dueD;
    int daysLeft = countDaysLeft(curr, dueDate);
    System.out.println("Today is: "+curr);
    System.out.println("Due date: "+dueDate);
    if (countDaysLeft(curr, dueDate)==0){
      System.out.println("The due date has passed! :( Better luck next time");}
    else{
      System.out.println("You have "+daysLeft+" days left' You can do it!");}
  }
    
  }   
















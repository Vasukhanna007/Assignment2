// student id: 260831350
//name : Vasu Khanna
public class LeftTriangle{
  public static void main (String args[])
  {
    int i,j;  
    int x =Integer.parseInt(args[0]); //converting string input to integer 
   // if x is 0 or negative , error . 
    if (x<=0){
      System.out.println(" Error: input value must be >= 0");//when x is positive 
     // using loops 
    }
    else{ // using loops
         for (i=0;i<x;i++){  
           for(j=0;j<=i;j++) {
              // inner loop which prints
                 System.out.print("*");
           }
            System.out.println();
         }
    
    
    }
  
  
  
  }
     


}
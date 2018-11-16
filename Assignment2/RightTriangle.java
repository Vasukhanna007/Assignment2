// student id: 260831350
//name : Vasu Khanna
public class RightTriangle{
  
  public static void main (String args[]){
// declaring variables
    int i,j,k;  
    int x =Integer.parseInt(args[0]); //converting string input to integer 
   // if x is 0 or negative , error . 
    if (x<=0){
      System.out.println(" Error: input value must be >= 0");
    }
    
    if(x>0) {   //when x is positive 
     // using loops 
      for(i=1;i<=x;i++)  //outer loop
      { 
        for (j=x;j>i;j--)  // for space
        {
          System.out.print(" ");   
        }
             for(k=1; k<=i; k++) // inner loop which prints
             {
                    System.out.print(i);
          }
            
         
         System.out.println();  // new line 
    }
    }
  }  
} 
    
// student id: 260831350
//name : Vasu Khanna
public class Classifier {
 
   
  public static void main(String[] args){
    //taking input of beakSize and clawSize 
   int beakSize = Integer.parseInt(args[0]);
     int clawSize = Integer.parseInt(args[1]); 
      String color = args[2];//taking color input
                      // calling methods
       if ((isTypeA(beakSize,clawSize, color)) )//using method of type boolean
        {
         System.out.print("The type of bird is A");
       }
        else if ((isTypeB(beakSize,clawSize,color)) )
       {
         System.out.print("The type of bird is B");
       }
       else  if ((isTypeC(beakSize,clawSize,color)) )
       {
         System.out.print("The type of bird is C");
       }
        else{   // if it doesnot belong to any category
             System.out.println(" This bird is not part of the study");
        }
        
        if ((isTypeC(beakSize,clawSize,color))&&(isTypeA(beakSize,clawSize,color)) )
       {
         System.out.println(" C ");
      
       }
          if ((isTypeC(beakSize,clawSize,color))&&(isTypeB(beakSize,clawSize,color)) )
       {
         System.out.println(" C ");
         
       }
            if ((isTypeB(beakSize,clawSize,color))&&(isTypeA(beakSize,clawSize,color)) )
       {
         System.out.println(" B ");
       }
       
      
       
  
   }
  public static boolean isTypeA(int BEAK_MM,int CLAW_MM,String COLOR){
    
    // if color is grey and it satisfies the conditions below of beakSize and clawSize it belongs to A, else no .
    if(COLOR.equals("Grey"))
    {
        if (BEAK_MM==1&&CLAW_MM==0||BEAK_MM==2&&CLAW_MM==1
              ||BEAK_MM==3&&CLAW_MM==2||BEAK_MM==4&&CLAW_MM==3
              ||BEAK_MM==4&&CLAW_MM==4||BEAK_MM==5&&CLAW_MM==4)
        {
          return true;
         
         }
         else 
         { 
         return false;
         }
    }
   else 
    {
     return false;
    }
     
  }
  public static boolean isTypeB(int BEAK_MM, int CLAW_MM, String COLOR){
     // if color is grey and it satisfies the conditions below of beakSize and clawSize it belongs to b, else no 
    if(COLOR.equals("Grey")){
      if( BEAK_MM==4&&CLAW_MM==5||
         BEAK_MM==4&&CLAW_MM==4||BEAK_MM==5&&CLAW_MM==6
           ||BEAK_MM==5&&CLAW_MM==7) {
      
      return true;
      }
      else 
      {
        return false;
      }
    } // if color is blue and it satisfies the conditions below of beakSize and clawSize it belongs to b, else no 
      if(COLOR.equals("Blue")){
        if(BEAK_MM==5&&CLAW_MM==6||BEAK_MM==5&&CLAW_MM==7||
           BEAK_MM==6&&CLAW_MM==8||BEAK_MM==6&&CLAW_MM==9||
           BEAK_MM==7&&CLAW_MM==10||BEAK_MM==8&&CLAW_MM==11)  {    
            return true;
        }
      
        else
        {
        return false;
      }
      }
        else 
        {
          return false;
        }
  }
  
  public static boolean isTypeC(int BEAK_MM, int CLAW_MM, String COLOR){
    if(COLOR.equals("Blue")){
      if(BEAK_MM==5&&CLAW_MM==6||BEAK_MM==5&&CLAW_MM==7){
        return true;
      }
      else{
      return false;
      }
        
     }
    if(COLOR.equals("Green")){
  if(BEAK_MM==5&&CLAW_MM==6||BEAK_MM==5&&CLAW_MM==7||
     BEAK_MM==6&&CLAW_MM==8||BEAK_MM==6&&CLAW_MM==9||
     BEAK_MM==7&&CLAW_MM==10||BEAK_MM==8&&CLAW_MM==11
       ||BEAK_MM==8&&CLAW_MM==11){
    return true;
  }
  else {
     return false;
  }
    }
  
  
  else{
    return false;
  }
  
    
   
    
  } 
  }  
  


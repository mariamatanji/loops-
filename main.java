import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int finalVal;

      finalVal = 0;
      userNum = scnr.nextInt();

      /* Your code goes here */
      while(userNum>=0){
         if(userNum % 5 != 0){
         System.out.println("miss");
         
         }else{
            System.out.println("hit");
            finalVal++;
            
         }
         userNum = scnr.nextInt();
      }

      System.out.println("Final value is " + finalVal);
   }
}

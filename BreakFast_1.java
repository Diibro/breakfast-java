
import java.util.Scanner;

public class BreakFast_1{
     public static Scanner getin = new Scanner(System.in);
     public static void main(String[] a){
         messagePrint("\n\nMy Breakfast from oop java", 2, '-');
         String[] messages = {"Check the quarter of a month: 1", "Print the odd values in certain range: 2", "Reverse an integer: 3"};
         multilinePrinter(messages, 0, '-');
          System.out.print("\nEnter your choice: ");
          int n = getin.nextInt();
          switch(n){
               case 1: tea_1();
               break;    
               case 2: tea_2();
               break;
               case 3: tea_3();
               break;
               default: messagePrint("Please enter a valid value", 1, '*');
          }

     }

     public static void messagePrint(String message, int choice, char signi){
          System.out.println(message);
          if(choice >= 1){
               for (int j = 1; j <= choice; j++){
                    for(int i = 0; i < message.length(); i++ ){
                         System.out.print(signi);
                    }
                    System.out.println(" ");
               }
               System.out.println(" ");
          }
     }

     public static void multilinePrinter(String[] messages, int choice, char signi) {
          for (int i = 0; i < messages.length; i++){
               messagePrint(messages[i], choice, signi);
          } 
     }

     public static void tea_1() {
          System.out.println("this is a sub program to check the quater of a given month number");
          int monthNum = getin.nextInt();
          switch(monthNum) {
               case 1: case 2: case 3: case 4:
                    System.out.println("the entered month is in the First Quarter");
                    break;
               case 5: case 6: case 7: case 8:
                    System.out.println("the month entered is in the second quarter");
                    break;
               case 9: case 10: case 11: case 12:
                    System.out.println("the month entered is in the third quarter");
                    break;
               default:
                    System.out.println("The month entered does not exit please try agin!");
          }
     }

     public static void tea_2(){
          System.out.println("This is a sub-program to print the odd numbers between values entered by a user");
          System.out.print("Enter small number: ");
          int num1 = getin.nextInt();
          System.out.print("Enter large Number: ");
          int num2 = getin.nextInt();

          for(int i = num1; i <= num2; i++){
               if(i%2 == 1){
                    System.out.print(" " + i);
               }
          }
     }

     public static void tea_3() {
          System.out.println("this is an integer reverser");
          System.out.print("enter any number: ");
          int num = getin.nextInt();
          String str = Integer.toString(num);
          char[] chararr = new char[str.length()];
          for(int i = (str.length() - 1); i >= 0; i--){
               chararr[(str.length() - 1) - i] = str.charAt(i); 
          }
          String newStr = new String(chararr);

          int finalnum = Integer.valueOf(newStr);
          System.out.println("the new number is " + (finalnum + 1));
     }

}
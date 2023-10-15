
import java.util.Scanner;

public class BreakFast_1{
     public static Scanner getin = new Scanner(System.in);
     public static void main(String[] a){
         messagePrint("\n\nMy Breakfast from oop java", 2, '-');
         String[] messages = {
               "Check the quarter of a month: 1",
               "Print the odd values in certain range: 2", 
               "Reverse an integer: 3",
               "Print even sum and odd sum in set of numbers: 4",
               "Perform several sum operations on numbers: 5",
               "Print armstrong numbers btn 1 and 500"
          };
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
               case 4: tea_4();
               break;
               case 5: tea_5();
               break;
               case 6: tea_6();
               break;
               default: messagePrint("Please enter a valid value", 1, '*');
          }
          getin.close();

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

     public static void tea_4(){
          messagePrint("This is a sub system to print the sum of even and odd numbers with in a set of numbers you enter", 0, '0');
          System.out.print("Enter the size of your array: " );
          int numsize = getin.nextInt();
          int[] nums = new int[numsize];
          int evensum = 0, oddsum = 0;
          for(int i=0; i < numsize; i++) {
               nums[i] = getin.nextInt();
               evensum += nums[i] % 2 == 0 ? nums[i] : 0 ;
               oddsum += nums[i] % 2 == 1 ? nums[i] : 0 ;
          }
          StringBuilder str = new StringBuilder();
          str.append("[ ");
          for(int i = 0; i < numsize; i ++){
               str.append(nums[i]);
               if(i < numsize - 1){
                    str.append(",");
               }
          }
          str.append(" ]");
          System.out.println( "for the set "+ str +" The sum of even numbers in the set is: " + evensum + "\nAnd the sum of the odd number is: "+ oddsum);
     }

     public static void tea_5(){
          messagePrint("This is a sub program that performs sum operation on the numbers you enter", 1, '-');
          boolean choice = true;
          int num1, num2, numsum = 0;
          String message = "";
          do{
               System.out.print("Enter first number: ");
               num1 = getin.nextInt();
               System.out.print("Enter second number: ");
               num2 = getin.nextInt();
               numsum = num1 + num2;
               getin.nextLine();
               System.out.println("the sum of the enter number is: " + numsum);
               System.out.println("Do you wish to perform the operation again: ");
               message = getin.nextLine();
               choice = message.equals("yes");
          }while(choice);
     }

     public static void tea_6(){
          messagePrint("this is a subprogram that prints all armstrong number btn 1 and 500", 1, 'o');
          for (int i = 1;i <= 500; i++){
               String str = Integer.toString(i);
               int numSum = 0, cubee, tempnum;
               for(int j = 0; j < str.length(); j++){
                    tempnum = str.charAt(j) - '0';
                    cubee = tempnum * tempnum * tempnum;
                    numSum += cubee;
               }
               if(numSum == i) System.out.print(i + " ");
          }
     }
}
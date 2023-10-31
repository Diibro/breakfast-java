import java.lang.Math;
import java.util.Scanner;

public class Learn{
     public static void main(String[] a){
          Scanner getin = new Scanner(System.in);
          //int num = 12;
          double num2 = 9.75666;
          long num3 =  Math.round(num2);
          System.out.println(num3);
          int choice = getin.nextInt();
          //int bool = choice % 2 == 0 ? 1 : 0 ;
          String num4 = switch(choice % 2){
               case 0  -> "even";
               case 1 -> "odd";
               default -> "invalid number";
          };
          System.out.println("you entered " + num4);
          getin.close();
     }
}

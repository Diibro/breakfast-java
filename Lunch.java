import java.util.Scanner;

public class Lunch{
     public static void main(String[] args) {
          System.out.println("this is my lunch that i enjoy so much");
          Scanner getin = new Scanner(System.in);
          System.out.println("Enter three number");
          int num1 = getin.nextInt();
          int num2 = getin.nextInt();
          int num3 = getin.nextInt();
          getin.close();
          Average myAverage = new Average(num1, num2, num3);
          myAverage.printAverage();


     }
}

class Average{
     private float average;
     Average(int a, int b, int c){
          this.average = (a + b + c)/ 3 ;
     }    

     public void printAverage() {
          System.out.print("The average of the numbers you entered are " + this.average );
     }

     public float getAverage(){
          return this.average;
     }
}
//am learning from the core java v 12 every morning taking my favorite breakfast
import java.io.*;
import java.util.Formatter;
import java.util.Calendar;

import java.util.Scanner;

public class BreakFast_2{
     public static Scanner getin = new Scanner(System.in); 
     public static void main(String[] args){
          // System.out.println("I am learning from  a java bbook");
          // Shape triangle = new Triangle();
          // triangle.draw();

          Formatter fmt = new Formatter();
          Calendar cal = Calendar.getInstance();

          fmt.format("%tc", cal);
          System.out.println(fmt);
     }
}

class Shape {
     public  void draw(){
          System.out.println("drawing a shape");
     }
}

class Circle extends Shape{
     public void draw(){
          System.out.println("drawing a circle");
     }
}

class Triangle extends Shape{
     public void draw(){
          System.out.println("drawing a triangle");
     }
}

class Vehicle{
     public void move(){
          System.out.println("can move");
     }

     public String move(String num){
          return num;
     }
}
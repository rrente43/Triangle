/*
Rubi Renteria
CS 1101 lab
In this assignment I will create a program that will determine the Area, Perimeter and Angles of a Triangle, given 3 coordinates. 
The user will type in the coordinates. I was able to turn in the input into coordinates but I didn't know how to convert the string into a double.
I'm yet to create an if statement to determine whether the user is entering a string or an interval.
Creating a formula for the area and perimeter was simple, but when it came to the angles I had issues. I keep getting not a number.
I also had issues when it came to language. I was trying so hard not to get confused with js.
*/
import java.util.Scanner;
// using scanner so user can type in coordinates
public class lab1a {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //assigning number variables
       Double x,y,x1,y1,x2,y2;
       
       System.out.print("Enter the X and Y coordinate of point A. Type values individually and then press enter.");
       x= input.nextDouble();
       y= input.nextDouble();
       System.out.print("Enter the X1 and Y1 coordinate of point B ");
       x1= input.nextDouble();
       y1= input.nextDouble();
       System.out.print("Enter the X2 and Y2 coordinate of point C ");
       x2= input.nextDouble();
       y2= input.nextDouble();
       //printing out the coordinates for the user
       System.out.println( "-----------------");
       System.out.println( "Your coordinates are:");
       System.out.println("Coordinate A:( " + x +", "+ y + ")");
       System.out.println("Coordinate B:( " + x1 +", "+ y1 + ")");
       System.out.println("Coordinate C:( " + x2 +", "+ y2 + ")");
       System.out.println( "-----------------");
        //create a function where we use the user inputs to solve for the area
       double area = (x*(y1-y2)+x1*(y2-y)+x2*(y-y1))/2;
       System.out.println("The area of the Triangle is: " + area); 
       System.out.println( "-----------------");

        // here I solve for each lenght side of the triangle, it will be used for the angles
        double a = Math.sqrt(Math.pow((x1- x),2) + Math.pow((y1 - y),2));
        double b = Math.sqrt(Math.pow((x2 - x),2) + Math.pow((y2 - y),2));
        double c = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        // addition
        double perimeter = a + b + c;
        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println( "-----------------");
        // here I solve for the angles using the sides.
        double angleA= Math.acos((Math.pow((b),2)+ Math.pow((c),2) - Math.pow((a),2))/2*b*c);
        double angleB= Math.acos((Math.pow((c),2)+ Math.pow((a),2)-Math.pow((b),2))/2*b*c);
        // I thought I could just do the math here
        double angleC= 180-angleA-angleB;

        // I thought of converting, but did not work. Still getting NAN
        // angleA = (float) (angleA * 180/ PI);
        // angleB = (float) (angleB * 180/ PI);
        
        //printing out the angles
        System.out.println("The angles are as follow:");
        System.out.println("Angle A: " + angleA);
        System.out.println("Angle B: " + angleB);
        System.out.println("Angle C: " + angleC);

        // I understand why we close now.
       input.close();
   } 
}
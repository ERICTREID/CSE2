//Eric Reid
//CSE 2
//hw 3 problem 2
//This program will ask a user for the lenght, width and height of a block and compute
//the volume and surface area of the block.  Measurements should be doubles.
import java.util.Scanner;//import scanner class for user input

public class Block{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );//create a new instance of the scanner class
        System.out.print("Enter length of block: ");//prompt for length
        double length=myScanner.nextDouble();//scan in length
        System.out.print("Enter width of block: ");//prompt for width
        double width=myScanner.nextDouble();//scan in width
        System.out.print("Enter height of block: ");//prompt for height
        double height=myScanner.nextDouble();//scan in height
        double volume=length*height*width;//find volume
        double surfacearea=2*length*height+ 2*length*width+ 2*height*width;//find the surface area
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+
        " is: "+volume+". The surface area is: "+surfacearea);//print output 

    }
}
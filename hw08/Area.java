/*
Eric Reid
CSE 02
10/16/2015
Homework 8 Problem 1
This program will calculate the area of one of three different shapes,
as selected by the user. It will also verify user input
*/


import java.util.Scanner;//import scanner class for user input

public class Area{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        String shape = " ";//create shape type string
        boolean continput=true;//looping condition
        while(continput){
            System.out.print("Enter shape: ");
            shape=myScanner.nextLine();//enter string
            if(!(((shape.equals("rectangle")))||((shape.equals("circle")))||((shape.equals("triangle"))))){//test if the string is accepted
                continput=true; //if so have looping conditions
                System.out.println("Input not valid. Please input either 'rectangle' 'circle' or 'triangle'");
            }
            else{
                continput=false;//switch off input loop
            }
        }
        //see which shape the user inputed, and call the corresponding method
        if(shape.equals("rectangle")){
            //test for rectangle
            rectangle();//call rectangle method
        }
        else if(shape.equals("circle")){
            //test for circle
            circle();//call circle method
        }
        else{
            //only option left is triangle
            triangle();//call triangle method
        }
    }
    public static void rectangle(){
        //calculate area of rectangle 
        double side1=0;//define side 1
        double side2=0;//define side 2
        System.out.print("Input side 1 length. ");
        side1=doubleinput();//call double input for side 1
        System.out.println();
        System.out.print("Input side 2 length. ");
        side2=doubleinput();//call double input for side 2
        double area= side1*side2;//calculate area
        System.out.println("The area of the rectangle is: "+area);
    }
    public static void circle(){
        System.out.print("Input radius. ");
        double radius=doubleinput();//define radius
        double area = 3.14159*radius*radius;//calculate area
        System.out.println("The area of the circle is: "+area);//
    }
    public static void triangle(){
        System.out.print("Input height. ");
        double height=doubleinput();//define height
        System.out.println();
        System.out.print("Input base. ");
        double base=doubleinput();//define base
        double area=.5*base*height;//calculate area
        System.out.println("The area of the triangle is: "+area);
    }
    public static double doubleinput(){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        //input doubles 
        double input=0;
        boolean continput=true; //looping condition
        while(continput){
            try{
                System.out.print("Enter value: ");
                input = myScanner.nextDouble();//scan in input
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid number.");
                continput=true;
                myScanner.nextLine();
            }
        }
        return input;//return input value
    }
        
}



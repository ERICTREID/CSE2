/*
Eric Reid
CSE 02
Lab 8 10/16/15
This program will have the user input 5 doubles, which will be checked to see
if the values are from smallest to largest, then will print the mean and median of the
numbers
*/

import java.util.Scanner;//import scanner class for user input

public class Stats{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        //create input exception loop
        //define number values
        double number1=0;
        double number2=0;
        double number3=0;
        double number4=0;
        double number5=0;
        boolean continput=true; //begin while loop after getting first value
        System.out.print("Enter first value: ");
        number1= myScanner.nextDouble();//scan in double
        System.out.println();
        while(continput){
            System.out.print("Enter second value: ");
            number2=myScanner.nextDouble();//scan in double
            System.out.println();
            if(number2 <= number1){
                continput=true;
                System.out.println("Number must be greater than previous");//
            }
            else{
                continput=false;
            }
        }
        continput=true;//reset loop
        while(continput){
            System.out.print("Enter third value: ");
            number3=myScanner.nextDouble();//scan in double
            System.out.println();
            if(number3 <= number2){
                continput=true;
                System.out.println("Number must be greater than previous");//
            }
            else{
                continput=false;
            }
        }
        continput=true;//reset loop
        while(continput){
            System.out.print("Enter fourth value: ");
            number4=myScanner.nextDouble();//scan in double
            System.out.println();
            if(number4 <= number3){
                continput=true;
                System.out.println("Number must be greater than previous");//
            }
            else{
                continput=false;
            }
        }
        continput=true;//reset loop
        while(continput){
            System.out.print("Enter fifth value: ");
            number5=myScanner.nextDouble();//scan in double
            System.out.println();
            if(number5 <= number4){
                continput=true;
                System.out.println("Number must be greater than previous");//
            }
            else{
                continput=false;
            }
        }
        //now we have all five doubles, properly checked for ascending order
        double meanval = mean(number1,number2,number3,number4,number5); //feed the numbers into the mean method and store
        //result into meanval doulbe
        double medianval = median(number1,number2,number3,number4,number5);//feed numbers into median method
        print(meanval,medianval);//call the printing method to print values
    }
    public static double mean(double num1,double num2,double num3,double num4, double num5){
        //create a mean method that returns the mean of five numbers
        double value=(num1+num2+num3+num4+num5)/5;//calculate mean
        return value;//return mean
    }
    public static double median(double num1,double num2,double num3,double num4, double num5){
        //create a method to calculate the median
        double value=num3;//get third value
        return value; 
    }
    public static void print(double value1, double value2){
        //create a printing method to print the two numbers
        System.out.println("The mean is: "+value1);//print mean
        System.out.println("The median is: "+value2);//print median
    }
}

            
        
//Eric Reid
//CSE 2
//Hw 06 Problem 1
//10/4/2015
//This program will graph a histogram of spending by day, and then do a 
//prediction for changing expenses over time. 

import java.util.Scanner;//import scanner class for user input


public class BarGraph{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        double monday=0; 
        double tuesday=0; 
        double wednesday=0; 
        double thursday=0; 
        double friday=0; 
        double saturday=0;
        double sunday=0; //initing variables
        boolean continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Monday: $"); //try monday exception
                monday = myScanner.nextDouble();//scan in monday cost
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(monday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Tuesday: $"); //try monday exception
                tuesday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(tuesday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Wednesday: $"); //try monday exception
                wednesday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(wednesday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Thursday: $"); //try monday exception
                thursday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(thursday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
       continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Friday: $"); //try monday exception
                friday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(friday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Saturday: $"); //try monday exception
                saturday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(saturday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Expenses for Sunday: $"); //try monday exception
                sunday = myScanner.nextDouble();//scan in monday cost
                
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if(sunday<0 && !continput){//test if input is less than zero, but still is a double
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        //Print out bar graphs for each day
        int i=0; //counting variable
        System.out.print("Mon: \t");
        while(i<monday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();//get new line
        i=0;
        System.out.print("Tues:\t");
        while(i<tuesday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        System.out.print("Wed: \t");
        i=0;
        while(i<wednesday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        System.out.print("Thu: \t");
        i=0;
        while(i<thursday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        System.out.print("Fri: \t");
        i=0;
        while(i<friday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        System.out.print("Sat:\t");
        i=0;
        while(i<saturday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        System.out.print("Sun: \t"); 
        i=0;
        while(i<sunday){
            System.out.print("*"); //print star
            i=i+1; //increment
        }
        System.out.println();
        //find average weekly expenditure
        double averageweek=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7; 
        System.out.printf("Your average weekly cost is: $%.2f \n",(float) averageweek);
        //estimate yearly expenses by using random percent variables
        int week=0; //week counter
        int weekperyear=52; //weeks per year
        double percent=((Math.random()*.4)-.2);
        double totalperyear=0; //create total cost per year variable. 
        double costweek=averageweek;//starting week cost 
        while(week<weekperyear){
            totalperyear=totalperyear+costweek; //add cost week to total cost
            costweek=averageweek+(percent*averageweek); //variations in cost per week
            percent=((Math.random()*.4)-.2);
            week=week+1; 
        }
        System.out.printf("Yearly cost = $%.2f \n",(float)totalperyear); 
    }
}

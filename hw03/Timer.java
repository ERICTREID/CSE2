//Eric Reid
//CSE 2
//hw 3 problem 1
//Prompts a user for a dinner time and the present time and calculates the time
//until dinner. Assume user inputs in HHMM military time, using integers
import java.util.Scanner;//import scanner class for user input

public class Timer{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );//create a new instance of the scanner class
        System.out.print("Enter the current time in HHMM military time: ");//prompt user for current time
        int currenttime=myScanner.nextInt();//scans into new int
        System.out.print("Enter the time of dinner in HHMM military time: ");//prompt user for dinner time
        int dinnertime=myScanner.nextInt();//scans in user input and creates an int
        //calculate minutes and hours
        int dinnerhour=dinnertime/100; //separate hours of dinner time
        int dinnerminute=dinnertime % 100;//seperate minutes of dinner time
        int currenthour=currenttime/100;//seperate current hours
        int currentminute=currenttime %100;//seperate current minutes
        System.out.println("You have "+(dinnerhour-currenthour)+" hours and "+ (dinnerminute-currentminute)+ " minutes until dinner");//print out time
    }
}

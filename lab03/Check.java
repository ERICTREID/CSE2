//Eric Reid
//CSE 002
//Lab 03
//This program will allow a user to input:
//Check cost, %tip they wish to pay, number of ways check split
//then determine how much each person should pay. 
import java.util.Scanner;

public class Check {
                // main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );//create a new instance of the scanner class
        System.out.print("Enter the original cost of the check, in the form xx.xx: ");//prompt user input for cost of check
        double checkcost=myScanner.nextDouble();//get user input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );//prompt user for % tip
        double tipPercent = myScanner.nextDouble();//get number
        tipPercent /= 100;//We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");//prompt user for number of people
        int numPeople = myScanner.nextInt();//scan in number
        double totalCost;
        double costPerPerson;
        int dollars,   //whole dollar amount of cost 
              dimes, pennies; //for storing digits
                  //to the right of the decimal point 
                  //for the cost$ 
        totalCost = checkcost * (1 + tipPercent);//calculate total cost
        costPerPerson = totalCost / numPeople;//calculate cost per person
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;//convert to integers with dimes
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    }  //end of main method   
} //end of class
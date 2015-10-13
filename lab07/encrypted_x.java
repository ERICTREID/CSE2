/*
Eric Reid
CSE 2
10/9/15
Lab 7
This program will output a grid of stars with blank spaces that make the form of an x.
The user will input the number of stars in each row, which is equal to the number of rows.
*/

import java.util.Scanner;//import scanner class for user input

public class encrypted_x{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        int input=0;//define and declare input
        boolean continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Enter square size: "); //try to get square size
                input = myScanner.nextInt();//scan in input
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if((input<0 || input>100) && !continput){//test if input is less than zero or greater than 100
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        for(int i=0;i<input;i++){
            //begin outer row loop, i gives row number
            for(int j=0; j<input; j++){
                //line by line output
                if(i==j||j==(input-(i+1))){
                    //test to see if position is equal to row number or if it is equal to the input minus the row number
                    System.out.print(" ");//print x character
                }
                else{
                    System.out.print("*");//print encrypting character
                }
            }
            System.out.println();//print next row
        }
    }
}

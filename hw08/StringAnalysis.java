/*
Eric Reid
CSE 02
Homework 8 Problem 2
10/16/2015
This program will have a user input a string, and then either check a certain number
of the characters are letters or if all of them are letters.
*/

import java.util.Scanner;//import scanner class for user input

public class StringAnalysis{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        System.out.println("Enter string");
        System.out.print("String: ");
        String input=myScanner.nextLine();
        System.out.println("Do you want to enter a number of characters to check?");
        System.out.print("Enter 'yes' or 'no': ");
        String integer=" ";
        boolean continput=true; 
        while(continput){
            System.out.print("Enter answer: ");
            integer=myScanner.nextLine();//enter string
            if(!(((integer.equals("yes")))||((integer.equals("no"))))){//test if the string is accepted
                continput=true; //if so have looping conditions
                System.out.println("Input not valid. Please input either 'yes' or 'no'");
            }
            else{
                continput=false;//switch off input loop
            }
        }
        //call methods 
        boolean areletters;
        if(integer.equals("yes")){
            System.out.println("Enter number of characters: ");
            int number=myScanner.nextInt();
            areletters=checkchar(number, input);
        }
        else{
            areletters=checkchar(input);
        }
        if(areletters){
            System.out.println("The string only contains letters.");
        }
        else{
            System.out.println("The string doesn't only contain letters.");
        }
    }
    public static boolean checkchar(int number, String input){
        //method for number characters 
        if(number>input.length()){
            number=input.length();
        }
        boolean areletters=true;//assume string is all letters
        for(int i=0; i<=number-1; i++){//step through string
            char next=input.charAt(i);
            if(next>='a'&&next<='z'){
                continue;//test for a letter
            }
            else{
                areletters=false;
                break;
            }
        }
        
        return areletters;
    }
    public static boolean checkchar(String input){
        boolean areletters=true;//asssume string is all letters
        for(int i=0;i<=input.length()-1;i++){//step through each character of string
            char next=input.charAt(i);
            if(next>='a'&&next<='z'){
                continue;
            }
            else{
                areletters=false;
                break;
            }
        }
        return areletters;
    }
}

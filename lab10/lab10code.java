/*
Eric Reid
CSE 002
Lab 10
10/30/15

This program will create an array of student names of randomized length,
then ask the user to input names for the array.  Then we create an array
of the same length as the students array and fill it with values, then print out
the names and their grades

*/

import java.util.Scanner;//import scanner class for user input

public class lab10code{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        int arraylength= (int) (Math.random()*6)+5;//create a random length from 5 to 10 
        String[] students= new String[arraylength];//define and allocate a string array
        for(int i=0; i<=arraylength-1;i++){
            System.out.print("Enter student name: ");//propt user input
            students[i]=myScanner.nextLine();//input user name into array position
        }
        int[] midgrades= new int[arraylength];//create a midterm grade array
        for(int i=0; i<=arraylength-1;i++){
            midgrades[i]=(int) (Math.random()*101);//create a grade between 0 and 100 for every student
        }
        System.out.println("Here are the midterm grades of the students above: ");
        for(int i=0; i<=arraylength-1;i++){
            System.out.print(students[i]+": "+midgrades[i]);//print out grades
            System.out.println();//print new line
        }
    }
}

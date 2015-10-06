//Eric Reid
//CSE 2
//Hw 06 Problem 2
//10/4/2015
// This program will check a 10 digit barcode inputted by the reader and determine its 
//validity.  If the user inputs 10 numbers that aren't a barcode, it will suggest a 
//check number that would make it so 


import java.util.Scanner;//import scanner class for user input


public class CheckDigit{
    //main method

    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);//create scanner instance
        
        int length=0;//find length of isbn string
        boolean input=true;//asume input is bad 
        String isbn="0";//define isbn string
        while(input){//get user input and check it 
            System.out.print("Enter an ISBN Number: ");//prompt user
            isbn= myScanner.nextLine();//accept user input
            length=isbn.length();//find length of string
            if(length !=10){
                System.out.println("Not a Valid ISBN");
                continue;//repeat loop
            }
            input=false;//so far input is a correct ISBN
            for(int i=0;i<=8;i++){ 
                //check each character to see if it is a number, except check digit
                char digit=isbn.charAt(i);//get digit character
                if(digit=='1'||digit=='2'||digit=='3'||digit=='4'||digit=='5'||digit=='6'||digit=='7'||digit=='8'||digit=='9'||digit=='0'){
                    //test to see if character is a digit
                }
                else{
                    input=true;
                    System.out.println("Not a Valid ISBN");
                    break;
                }
            }
            char digit=isbn.charAt(9);//check last digit value, inluding X
            if(digit=='1'||digit=='2'||digit=='3'||digit=='4'||digit=='5'||digit=='6'||digit=='7'||digit=='8'||digit=='9'||digit=='0'||digit=='X'){
                //test to see input
            }
            else{
                input=true;//continue looping
                System.out.println("Not a Valid ISBN");
            }
        }
        //Get sum of each the first 9 numbers 
        int sum=0;//define summing value
        char digit; //define digit value
        int multiplier;//define multiplier
        for (int j=0;j<=8;j++){
            digit=isbn.charAt(j);//get character from string
            multiplier=10-j;
            sum=sum+((digit-'0')*multiplier);//add sum, subtract digit from 0 to get raw value from ACSCII
        } 
        char checkdigitchar=isbn.charAt(9);//define check digit
        //determine if it is an ISBN, and if not recommend check value
        if(checkdigitchar=='X'){
            if(sum%11==10){
                //determine if it is a correct ISBN number
                System.out.println("This is a Valid ISBN");
            }
            else{
                System.out.println("Not a valid check number");
                for(int k=0;k<=10;k++){//find correct check number through iteration
                    if(sum%11==k){
                        if(k==10){//print x if ten
                            System.out.println("A correct check value is: X");
                            break;
                        }
                        else{
                            System.out.println("A correct check value is: "+k);
                            break;
                        }
                    }
                }
            }
        }
        if(checkdigitchar =='X'){//don't need to reprint above happened
            //determine if it is a correct ISBN number
        }
        else if((sum%11==(checkdigitchar-'0'))){
            System.out.println("This is a Valid ISBN");//find if correct
        }
        else{
            System.out.println("Not a valid check number");
            for(int k=0;k<=10;k++){//determine correct check number through iteration
                if(sum%11==k){
                    if(k==10){
                        System.out.println("A correct check value is: X");
                        break;
                    }
                    else{
                        System.out.println("A correct check value is: "+k);
                        break;
                    }
                }
            }
        }
    }
    
}




        
        
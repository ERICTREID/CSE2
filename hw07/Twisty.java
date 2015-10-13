/*
Eric Reid
CSE 002
10/9/15
HW 07
This program creates interlocking V patterns of / and # based on filtered user input
*/
import java.util.Scanner;//import scanner class for user input


public class Twisty{
    //main method

    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        int length=0;//define and declare length
        boolean continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Enter length: "); //try to get length
                length = myScanner.nextInt();//scan in input
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if((length<0 || length>80) && !continput){//test if length is less than zero or greater than 80
                continput=true; //if so have looping conditions
                System.out.println("Input not valid.");
                myScanner.nextLine();//erase input
            }
        }
        int width=0;//define and declare width
        continput=true;//looping condition
        while(continput){
            try{
                System.out.print("Enter width: "); //try to get width
                width = myScanner.nextInt();//scan in input
                continput=false;
            }
            catch( java.util.InputMismatchException ex) {//exception cases
                System.out.println("Input not valid.");
                continput=true;
                myScanner.nextLine();
            }
            if((width<0 || width>length) && !continput){//test if length is less than zero or greater than 80
                continput=true; //if so have looping conditions
                System.out.println("Input not valid, width must be less than length.");
                myScanner.nextLine();//erase input
            }
        }
        //begin looping conditions
        for(int i=0; i<width; i++){
            //i will be the row counter, based on width
            for(int j=0; j<length;j++){
                //j will be the length position
                if((j%(2*width)==i)||(j%(2*width))==(2*width-(i+1))){
                    System.out.print("#");//print pound symbol helix
                }
                else if(j%(2*width)+1==(width-i) ){
                    System.out.print("/");//print half of slashes going up
                }
                else if(j%(2*width)==i+(width)){
                    System.out.print("\\");//print half of slashes going down
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();//print next row
        }
    }
}

        
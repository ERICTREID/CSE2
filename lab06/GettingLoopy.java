//Eric Reid
//CSE 2
//lab 6
//10/2/15
//This program, is going to do a lot of things with loops.
public class GettingLoopy{
    //main method

    public static void main(String[] args){
        System.out.println("Step 1: ");
        int i=1; //create a counting variable
        while (i<=7){
            System.out.print(i);//printing
            i=i+1;//increase counting
        }
        i=1; //reset counter
        while( i<=6){
            System.out.print(7);//printing extra 7s
            i=i+1;
        }
        System.out.println();//print new line for next step
        //Step 2, finding primes
        System.out.print("Step 2: \nWhile:");//step 2 
        int number=10; //number to be found a factor of
        int factor;//define factor variable
        boolean isprime=true; //define boolean var., assume all numbers are prime 
        while(number<=100){
            isprime=true; //assume number is prime
            //run through all number 10-100
            if (number%2==0){
                isprime=false;//number is divisible by 2
            }
            else{
                factor=2; //starting value for factor
                while(factor<number){
                    //while factor is less than the number being tested
                    if(number%factor==0){
                        //if the nuber is divisible by the factor then the number is not prime
                        isprime=false;
                        break;
                    }
                    else{
                        factor=factor+1;
                    }
                }
            }
            if(isprime){
                System.out.print(" "+number+" "); //print out number
            }
            number=number+1;//increase number
        }
        System.out.print(" \nFor: ");
        //do the same thing with for loops
        isprime=true; //define boolean var., assume all numbers are prime 
        for(int numberf=10;numberf<=100;numberf++){
            isprime=true; //assume number is prime
            //run through all number 10-100
            if (numberf%2==0){
                isprime=false;//number is divisible by 2
            }
            else{
                for(int factorf=2;factorf<numberf;factorf++){
                    //while factor is less than the number being tested
                    if(numberf%factorf==0){
                        //if the nuber is divisible by the factor then the number is not prime
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime){
                System.out.print(" "+numberf+" "); //print out number
            }
        }
        //do the same thing with do while
        System.out.print("\ndo-while: ");
        number=10; //number to be found a factor of
        isprime=true; //define boolean var., assume all numbers are prime 
        do{
            isprime=true; //assume number is prime
            //run through all number 10-100
            if (number%2==0){
                isprime=false;//number is divisible by 2
            }
            else{
                factor=2; //starting value for factor
                while(factor<number){
                    //while factor is less than the number being tested
                    if(number%factor==0){
                        //if the nuber is divisible by the factor then the number is not prime
                        isprime=false;
                        break;
                    }
                    else{
                        factor=factor+1;
                    }
                }
            }
            if(isprime){
                System.out.print(" "+number+" "); //print out number
            }
            number=number+1;//increase number
        }while(number<=100);
        
        System.out.println("\nStep 3: ");
        //Do step 3
        int on_line=15; //number of smileys per line
        int numbersmiley=75; //number of smileys total
        i=1; //counting number
        int numberonline=0; //number on line
        while (i<numbersmiley){ //loop through smileys
            numberonline=0;
            while((numberonline<on_line)&&(i<numbersmiley)){//loop through on line
                System.out.print("=)");
                numberonline=numberonline+1;
                i=i+1;
            }
            if(numberonline==on_line){
                System.out.println();//print smileys on new line
            }
        }
        System.out.println();//put the terminal to next line
        
        }
    }



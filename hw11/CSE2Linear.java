/*
Eric Reid
CSE 002
Homework 11
11/8/2015

This program will have a user input 15 final exam grades, sort them, and then conduct binary and linear
searches, outputting whether the desired grade was found, and in eihter case the number of 
iterations required to achieve the result

*/ 

import java.util.Scanner;//import scanner class for user input

public class CSE2Linear{
    //main method
    public static void main(String[] args){
        Scanner myScanner= new Scanner( System.in); // create new scanner object
        //Create length parameters
        int length= 15; //number of grades
        int[] grades= new int[length]; //create grade array
        boolean continput=true; //input logical
        int temp =0; 
        for( int i=0; i<=length-1 ;i++){
            //input each array element
            continput=true;
            while(continput){
                try{
                    System.out.print("Enter integer student grade, from 0-100: ");
                    temp = myScanner.nextInt();
                    continput=false;//assume we've gotten an int. 
                }
                catch( java.util.InputMismatchException ex){
                    //create an excpetion for not an integer
                    System.out.println("Not an integer"); //error message
                    continput=true;
                    myScanner.nextLine(); //clear scanner contents
                }
                if((temp<0 || temp>100) && !continput){
                    System.out.println("Number out of range from 0-100"); //error message
                    continput=true;
                    myScanner.nextLine(); //clear scanner contents
                }
                if(i !=0 && temp<grades[i-1]){
                    //if next value is less than the previous return an error
                    System.out.println("Number not greater than previous.");
                    continput=true; //continue looking for input
                    myScanner.nextLine(); //clear scanner contents
                }

            }
            grades[i]=temp; 
            temp=0; //clear temp variable. 
        }//achieve successful input 
        //begin working with array grades. 
        System.out.print("Enter searching value: ");
        int value=myScanner.nextInt();//input value
        binarysearch(grades,value); //run a binary search 
        shuffle(grades); //shuffle grades
        System.out.println("Scrambled array: "); 
        printArray(grades); 
        linearsearch(grades,value); //run linear search 
    }
    //METHODS
    public static void linearsearch(int[] grades, int value){
        //method to do a linear search to find the value in an array
        int iteration=0; //number of iterations
        boolean foundnumber=false; //haven't found the value
        for (int i : grades){//for each through grades array
            iteration++; //increase number of iterations
            if(grades[iteration-1]==value){
                foundnumber=true; //we've found the number
                break; 
            }
        }
        if(foundnumber){
            System.out.println("The value "+value+" was found in "+iteration+" iterations with linear search.");
        }
        else{
            System.out.println("The value " + value+ " was not found in "+iteration+" iterations with linear search.");
        }
    }
    
    public static void shuffle(int[] grades){
        int arraylength=grades.length;//find length of input array
        //create a method to randomize array
        int numberoftimes=50;//number of shuffle times
        int shuffleindex= (int) (Math.random()*arraylength);
        int intervalue;//declare intermdiate value
        for (int i=0; i<=numberoftimes;i++){
           shuffleindex= (int) (Math.random()*arraylength);
           intervalue=grades[shuffleindex];//store array value
           grades[shuffleindex]=grades[0];//switch array values
           grades[0]=intervalue;//replace zero value 
        }
    }
    
    public static void printArray(int[] grades){
    //create a method to print array elements with a space
    int arraylength=grades.length;//find length of input array
    for (int i=0; i<=arraylength-1;i++){
      //print out elements
       System.out.print(grades[i]+" ");
    }
    System.out.println();//print new lnie
  }
  
  public static void sort(int[] grades){
      //sort through the array in ascending order 
      for (int i=0; i<=grades.length-1;i++){
          //increase the indexing variable each pass through the array
          int index=i;  //define an indexing variable
          for(int j=i+1;j<grades.length;j++){
              //step through all of the remaining elements of the array
              if(grades[j]<grades[index]){
                  //determine if the current array value (j) is less than that of the index
                  index=j; //if so, this is the smallest array location and replace index with j
              }
          }
          int smallnumber=grades[index];//after looping through the remaining elements, index is the smallest location, put value into temp. variable
          grades[index]=grades[i];//replace whatever is currently in the index spot with whatever is in the lowest element spot (i)
          grades[i]=smallnumber; //put the smallest number into the smallest index spot, effectively sorting this iteration of the array.  
      }
  }
  
  public static void binarysearch(int[] grades, int value){
      //binary search
      int arraylength=grades.length;//find length of grades array
      int imin=0; //define minmum value to be 0
      int imax=arraylength;//upper value is array length
      int imidpoint=(imax-imin)/2; //midpoint index
      int iteration=0; //count iterations
      boolean found=false; //assume number not found
      while(imin<imax){         
          iteration++; //increase iteration
          //keep looping until the two indexing value are not equal
          imidpoint=imin+(imax-imin)/2; //redefine midpoint, adding the minimum point to get correct range 
          if(grades[imidpoint]==value){
              System.out.println("The value "+value+" was found in "+iteration+" iterations with binary search.");
              found=true; //we found the value
              break; 
          }
          else if(grades[imidpoint]<value){
              //check to see if the value is in the lower half
              imin=imidpoint+1; //redefine the minimum value
          }
          else{
              imax=imidpoint-1; //redefine maximum value, as it has to be in upper half of array
          }
      }
      if(!found){
          //if we didn't find the value
          System.out.println("The value was not found after "+iteration+" iterations with binary search."); 
      }
  }
}
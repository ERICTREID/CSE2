/*
Eric Reid

CSE 002 Lab 11
Working with arrays

*/
import java.util.Scanner;//import scanner class for user input

public class lab11code{
    //main method
    public static void main(String[] args){
        int[] array1 = new int[5000];//create array 1 
        int[] array2 = new int[5000];//create array 2 
        for (int i=0; i<=5000-1; i++){
            //assign random values to arrays 
            array1[i]=(int) (Math.random()*100000);
        }
        //fill in array2 with increasing random numbers
        array2[0]=(int)(Math.random()*100); //assign the first value to array2 
        for (int i=1; i<=5000-1;i++){
            //assign an increasing random number
            array2[i]=(int)(array2[i-1]+1+Math.random()*100); //guarentee that the next value is higher than the previous one 
        }
        int max1 = 0; //assign max value
        int max2 = 0; //assing max value 
        int min1 = 100000; //assign min value 
        int min2 = 100000; //assign min value
        for (int i=0; i<=5000-1; i++){
            if( array1[i] > max1){
                max1= array1[i]; //determine max
            }
            if(array2[i] > max2 ){
                max2= array2[i]; //determine max 
            }
            if (array2[i]<min2){
                min2=array2[i];
            }
            if (array1[i]<min1){
                min1=array1[i]; 
            }
        }
        System.out.println("Array 1 max: "+max1+"\n"+ "Array 1 min: "+min1);
        System.out.println("Array 2 max: " +max2+"\n"+ "Array 2 min: "+min2); 
        //parts 4 and 5 go here
        
        //input loop
        boolean continput=true; 
        int input=0; 
        System.out.println("Input a positive integer"); 
        Scanner scan = new Scanner(System.in);
        while (continput){
            input = scan.nextInt(); //input integer
            if(input<0){
                System.out.println("This integer is not greater than zero");
            }
            else{continput=false;}
        }
        //now we have an acceptable value to search for 
        int index=binarysearch(array2, input); //run a binary search 
        if(input<array2[0]){
            //index low bound does not exist
            System.out.println("Number below does not exist."); 
            System.out.println("Number above is: "+array2[index+1]); //no exception for above due to array length>1
        }
        else if(input>array2[array2.length-1]){
            System.out.println("Number below is: "+array2[index-1]); 
            System.out.println("Number above does not exist."); 
        }
        else{
            System.out.println("Number below is: "+array2[index-1]);
            System.out.println("Number above is: "+array2[index+1]); 
        }   
    }
    
      public static int binarysearch(int[] arrayn, int value){
      //binary search
      int arraylength=arrayn.length;//find length of arrayn array
      int imin=0; //define minmum value to be 0
      int imax=arraylength;//upper value is array length
      int imidpoint=(imax-imin)/2; //midpoint index
      int iteration=0; //count iterations
      boolean found=false; //assume number not found
      while(imin<imax){         
          iteration++; //increase iteration
          //keep looping until the two indexing value are not equal
          imidpoint=imin+(imax-imin)/2; //redefine midpoint, adding the minimum point to get correct range 
          if(arrayn[imidpoint]==value){
              found=true; //we found the value
              System.out.println("The value was found."); 
              break; 
          }
          else if(arrayn[imidpoint]<value){
              //check to see if the value is in the lower half
              imin=imidpoint+1; //redefine the minimum value
          }
          else{
              imax=imidpoint-1; //redefine maximum value, as it has to be in upper half of array
          }
      }
      if (!found){
          System.out.println("The value was not found."); 
          if(arrayn[0]>value){
              //if the low bound is higher than the value
              return 0; 
          }
          else if(arrayn[arraylength-1]<value){
              return arraylength-1;
          }
          else{
              return imidpoint; 
          }
          //print out if the value was not found 
      }else{ return imidpoint;} //return the last looked at midpoint}
    }
}

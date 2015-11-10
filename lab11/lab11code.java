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
            array2[i]=(int) (Math.random()*100000);
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
        System.out.println("Array 1 max: "+max1+ " Array 2 max: "+max2);
        System.out.println("Array 1 min: " +min1+ " Array 2 min: "+min2); 
        //parts 4 and 5 go here
        
        //input loop
        boolean continput=true; 
        int input=0; 
        System.out.println("Input a positive integer"); 
     Scanner scan = new Scanner(System.in);
        while (continuput){
            input = scan.nextInt(); //input integer
            if(input<0){
                System.out.println("This integer is not greater than zero");
            }
            else{continput=false;}
        }
        for (int i=0; i<=5000-1 ;i++){
            
        }
    }
}

/*
Eric Reid
CSE 002
Homework 12 11/13/15

This program will prompt a user for the width and height of an array, then generate a 
random matrix of this size. The program then prints this matrix, warning the user if the
matrix is not rectangular. Then, the program finds and prints the transpose of the matrix. 

*/
import java.util.Scanner; //import scanner class

public class Transpose{
    //main method
    public static void main(String[] args){
        //main method
        Scanner myScanner = new Scanner(System.in); //new instance of scanner class
        boolean continput=true;//looping code
        int width=0; //width entering
        while(continput){
            System.out.print("Input a positive integer for width: "); 
            try{
                width = myScanner.nextInt();
                continput=false;//assume we've gotten an int. 
            }
            catch( java.util.InputMismatchException ex){
                //create an excpetion for not an integer
                System.out.println("Not an integer"); //error message
                continput=true;
                myScanner.nextLine(); //clear scanner contents
            }
            if((width<0) && !continput){
                System.out.println("Number not positive."); //error message
                continput=true;
                myScanner.nextLine(); //clear scanner contents
            }
        }
        //enter height
        int height=0; //height entering
        continput=true; 
        while(continput){
            System.out.print("Input a positive integer for height: "); 
            try{
                height = myScanner.nextInt();
                continput=false;//assume we've gotten an int. 
            }
            catch( java.util.InputMismatchException ex){
                //create an excpetion for not an integer
                System.out.println("Not an integer"); //error message
                continput=true;
                myScanner.nextLine(); //clear scanner contents
            }
            if((height<0) && !continput){
                System.out.println("Number not positive."); //error message
                continput=true;
                myScanner.nextLine(); //clear scanner contents
            }
        }
        int matrix[][] = randomMatrix(height,width); //call matrix creation
        printMatrix(matrix); //call print matrix 
        int transposemat[][] = transposeMatrix(matrix); //transpose the matrix
        System.out.println("Transposed matrix: "); 
        printMatrix(transposemat); //print matrix 
        
    }
    public static void printMatrix(int matrix[][]){
        //method prints the matrix in row-major form
        int outerheight=matrix.length; //height of outer array
        int memberlenght1=matrix[0].length; //height of first array
        for (int i=0; i<outerheight; i++){
            //step through each member array
            if(memberlenght1 != matrix[i].length){
                //if the member arrays aren't the same height array is ragged
                System.out.println("Warning: The matrix is not rectangular."); 
            }
        }
        //begin printing array in row-major form
        for (int i=0; i<outerheight;i++){
            //step through member arrays
            for(int j=0; j<matrix[i].length;j++){
                //step through elements of member arrays
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println(); //print new line at end of each row 
        }
    }
    public static int[][] randomMatrix( int height, int width){
        //create a randomized matrix of size height x width
        int [][] matrix= new int[height][width]; //declare and allocate matrix
        for (int i=0; i<matrix.length; i++){
            //step through each member array
            for (int j=0; j<matrix[i].length;j++){
                //step through elements of each array. 
                matrix[i][j]=(int) (Math.random()*20)-10; //create random number between -10 and 10 
            }
        }
        return matrix; //return matrix
    }
    public static int[][] transposeMatrix(int[][]matrix){
        //method to transpose the matrix 
        int rows = matrix.length; //number of rows, length of outer array
        int columns = matrix[0].length; //number of columns, lenght of 0th member array
        int[][] transposemat= new int[columns][rows];//create new matrix
        for(int i=0; i<columns; i++){
            //step through each column
            for(int j=0; j<rows;j++){
                //pull the value in each column for each row
                transposemat[j][i]=matrix[i][j]; //take the inverse of the matrix
            }
        }
        return transposemat;//return matrix
    }
}
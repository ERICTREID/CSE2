/*
Eric Reid
CSE 02
11/13/15
Array manipulation

*/


public class lab12code{
    //methods
    public static int[][] raggedarray(){
        //create a ragged array of random integers
        int arraylength1= (int) (10+Math.random()*10);//create outer array length
        int[][] array1= new int[arraylength1][]; //
        return array1; //return array 1
    }
    public static void main(String[] args){
        //main method 
        raggedarray(); 
    }
}
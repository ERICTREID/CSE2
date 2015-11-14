/*
Eric Reid
CSE 02
11/13/15
Array manipulation

*/


public class lab12code{
    //methods
    public static void main(String[] args){
        //main method 
        int[][] array2=raggedarray(); 
        printArray(array2); 
        int smallestarray=findSmallest(array2);//find smallest member array
        System.out.println("Smallest length array: ");
        printArray(array2[smallestarray]);//print smallest array
        int[] largestarray=findLargest(array2); 
        System.out.println("In array: "); 
        printArray(largestarray);//print largest array
        System.out.println("Array with most number of even number: ");
        int[] mostevens= mostEven(array2);
        printArray(mostevens);
    }
    public static int[][] raggedarray(){
        //create a ragged array of random integers
        int arraylength1= (int) (10+Math.random()*10);//create outer array length
        int[][] array1= new int[arraylength1][]; //declare and allocate array
        for (int i=0; i<array1.length;i++){
            //allocate space for each member array
            arraylength1= (int) (10+Math.random()*10); //new random array length
            array1[i]= new int[arraylength1];//declare and allocate member array
        }
        //store random values in the array
        for (int i=0; i< array1.length;i++){
            //outer array step through
            for (int j=0; j<array1[i].length;j++){
                //each member array's length
                array1[i][j] = (int) ((Math.random()*2000)-1000); //fill with a value between -1000 and 1000
            }
        }
        return array1; //return array 1
    }
    public static void printArray(int[][] array){
        //print array
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(" "+array[i][j]+" "); 
            }
            System.out.println();//print new line for next row 
        }
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]+" ");
        }
        System.out.println();
    }
    public static int findSmallest(int[][] array){
        int arraylength=array[0].length; //find length of first member array
        int arraynumber=0; //number of array that is smallest length
        for(int i=0;i< array.length;i++){
            if(array[i].length<arraylength){
                //determine if the consdiered member array has a smaller length,if so:
                arraylength=array[i].length;//redefine shortest length
                arraynumber=i; //index number
            }
        }
        return arraynumber; //return the index of the smallest array value 
    }
    public static int[] findLargest(int[][] array){
        //find the largest member of the 2-D array, and print its value. return the array it is in
        int largestvalue=-1000; //define largest number at smallest
        int arraynumber=0; //array number
        for(int i=0; i< array.length;i++){
            for( int j=0; j< array[i].length; j++){
                //step through each array value and compare 
                if(array[i][j]>largestvalue){
                    //if larger
                    largestvalue=array[i][j];//value
                    arraynumber=i; //array index
                }
            }
        }
        System.out.println("Largest member of any member array: "+largestvalue);//print largest value
        return array[arraynumber];//return array of largest number
    }
    public static int[] mostEven(int[][] array){
        //find the member array with the most number of even numbers
        int numbereven=0; //number of even numbers
        int arraynumber=0; //array number where this occurs
        int mosteven=0; //array with most evens number of evens
        for(int i=0; i<array.length;i++){
            //step through each member array
            numbereven=0; //reset counter
            for(int j=0; j<array[i].length;j++){
                //find even members of array that are even,count
                if(array[i][j]%2==0){
                    numbereven++; //increase number even
                }
            }
            if(numbereven>mosteven){
                mosteven=numbereven; //redefine most even
                arraynumber=i; //array index where this occured 
            }
        }
        return array[arraynumber];//return this member array
    }
}
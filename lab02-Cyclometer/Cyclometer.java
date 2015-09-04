//Eric Reid
//Lab 02-CSE 2
//September 4th
//This program, given the time in seconds and the number of rotations calculates: 
//the time in minutes per trip
//the number of counts per trip
//the distance of the trip in miles
//and the distance of the two trips combined
public class Cyclometer{
    //main method required to run a program
    public static void main(String[] args){
        // our input data.
        int secsTrip1=480;  //seconds in trip 1
        int secsTrip2=3220;  //seconds in trip 2
        int countsTrip1=1561;  //wheel counts in trip 1
        int countsTrip2=9037; //wheel counts in trip 2
        // our intermediate variables and output data.
        double wheelDiameter=27.0;  //Wheel diameter in inches
        double PI=3.14159; //pi.  pretty self-explanatory
        double feetPerMile=5280;  //feet per mile.  self-explanatory. 
        double inchesPerFoot=12;   //I hope this is self explanatory, inches per foot
        double secondsPerMinute=60;  //I REALLY hope this is self explanatory.  seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance;  //total distances of trip 1, trip 2, total distance
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1=distanceTrip1/inchesPerFoot/feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//Gives the second distance in miles
        totalDistance=distanceTrip1+distanceTrip2;//gives total distance
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }//end of main method
}//end of class

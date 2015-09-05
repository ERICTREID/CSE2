//Eric Reid
//CSE 2
//September 4 
//Homework 2
//This program, given the quantity and cost of a set of items and a tax rate
//will calculate the total cost of the bill. 
public class Arithmetic {

    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks = 3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$ = 2.58;

        //Number of drinking glasses
        int nGlasses = 6;
        //Cost per glass
        double glassCost$ = 2.29;

        //Number of boxes of envelopes
        int nEnvelopes = 1;
        //cost per box of envelopes
        double envelopeCost$ = 3.25;
        double taxPercent = 0.06;
        //Calculate tax per item and print to screen
        double socktax = taxPercent * sockCost$; //tax on socks
        double glasstax = taxPercent * glassCost$; //glass tax
        double envelopetax = taxPercent * envelopeCost$; //envelope tax
        //Calculate the total cost of each item without tax
        double totalsockCost = sockCost$ * nSocks; //Total of socks
        double totalglassCost = glassCost$ * nGlasses; //Total  of glasses
        double totalenvelopCost = envelopeCost$ * nEnvelopes; //Total of envelopes
        double totalCost = totalsockCost + totalglassCost + totalenvelopCost; //total cost without tax
        //Calculate tax of totals of each item
        double sockcosttax = totalsockCost * taxPercent; //total sock cost with tax
        double glasscosttax = totalglassCost * taxPercent; //total glass cost with tax
        double envelopecosttax = totalenvelopCost * taxPercent; //total envelope cost with tax
        double totaltax = sockcosttax + glasscosttax + envelopecosttax; //total with tax
        //Totals
        double totalsockstax = sockcosttax + totalsockCost; //total of socks
        double totalglasstax = glasscosttax + totalglassCost; //total of glass
        double totalenvelopetax = envelopecosttax + totalenvelopCost; //total of envelope
        double totalwithtax = totaltax + totalCost; //total bill paid
        //Convert to two decimal places, see method below
        socktax = Convertotwoplaces(socktax);
        glasstax = Convertotwoplaces(glasstax);
        envelopetax = Convertotwoplaces(envelopetax);
        totalsockCost = Convertotwoplaces(totalsockCost);
        totalglassCost = Convertotwoplaces(totalglassCost);
        totalenvelopCost = Convertotwoplaces(totalenvelopCost);
        totalCost = Convertotwoplaces(totalCost);
        sockcosttax = Convertotwoplaces(sockcosttax);
        glasscosttax = Convertotwoplaces(glasscosttax);
        envelopecosttax = Convertotwoplaces(envelopecosttax);
        totaltax = Convertotwoplaces(totaltax);
        totalsockstax = Convertotwoplaces(totalsockstax);
        totalglasstax = Convertotwoplaces(totalglasstax);
        totalenvelopetax = Convertotwoplaces(totalenvelopetax);
        totalwithtax = Convertotwoplaces(totalwithtax);
        //Print out input data
        System.out.println("Socks Number: $" + nSocks + " Socks cost per unit: $" + sockCost$+ " Tax per unit: $"+socktax);
        System.out.println("Glasses Number: $"+nGlasses+ " Glasses cost per unit: $"+glassCost$+ " Tax per unit: $"+glasstax);
        System.out.println("Envelope Number: $"+nEnvelopes+ " Envelope cost per unit: $"+envelopeCost$+" Tax per unit: $"+envelopetax);
        //Print price outputs
        System.out.println("Sock cost: $"+totalsockCost+ " Sock tax: $"+sockcosttax+ " Total price of socks: $"+totalsockstax);//socks line
        System.out.println("Glasses cost: $"+totalglassCost+" Glass tax: $"+glasscosttax+" Total price of glasses: $"+totalglasstax);//glasses line
        System.out.println("Envelopes cost: $"+totalenvelopCost+" Envelope tax: $"+envelopecosttax+ " Total price of envelopes: $"+totalenvelopetax);//envelopes line
        System.out.println("Total cost: $"+totalCost+ " Total Tax: $"+ totaltax+ " Total Bill, including tax: $" + totalwithtax );//totals line
    }
    public static double Convertotwoplaces(double numbertoconvert) {
        //this will take in a double and convert it (rather crudely) to two decimal places
        numbertoconvert = numbertoconvert * 100; //prepare number for truncation
        int intnumber = (int) numbertoconvert; //truncate by converting to int
        double decimalnumber = (double) intnumber / 100; //convert int to double
        return decimalnumber; //pass out double
    }
}
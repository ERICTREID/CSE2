/*


Eric Reid
Homework 10
CSE 002
10/30/2015
This program prints out all the cards in a deck, randomly sorts them, and then randomly
picks a hand
*/
import java.util.Scanner;//import scanner class for user input


public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
}
printArray(cards);
System.out.println("Shuffled:");
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
System.out.println("Hand: ");
printArray(hand);
  }
  public static void printArray(String[] cards){
      //create a method to print array elements with a space
      int arraylength=cards.length;//find length of input array
      for (int i=0; i<=arraylength-1;i++){
          //print out elements
          System.out.print(cards[i]+" ");
      }
      System.out.println();//print new lnie
  }
  public static void shuffle(String[] cards){
      int arraylength=cards.length;//find length of input array
      //create a method to shuffle the cards
      int numberoftimes=50;//number of shuffle times
      int shuffleindex= (int) (Math.random()*arraylength);
      String intervalue;//declare intermdiate value
      for (int i=0; i<=numberoftimes;i++){
          shuffleindex= (int) (Math.random()*arraylength);
          intervalue=cards[shuffleindex];//store array value
          cards[shuffleindex]=cards[0];//switch array values
          cards[0]=intervalue;//replace zero value 
      }
  }
  public static String[] randomizeHand(String[] cards){
    String[] hand = new String[5];
      int arraylength=cards.length;//find input array length
      int shuffleindex=(int) (Math.random()*arraylength);
      for (int i=0; i<=5-1; i++){
          shuffleindex= (int) (Math.random()*arraylength);
          hand[i]=cards[shuffleindex];//pick a card
      }
      return hand;
  }
}

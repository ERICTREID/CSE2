//Eric Reid
//CSE 2
//Homework 4
//Poker hand checker program
//This program will randomly generate 5 cards, display them, then determine
//if the hand of 5 cards has a pair, two pair, or three of a kind
 
public class PokerHandCheck{
    //main method

    public static void main(String[] args){
        //Create 5 random cards
        System.out.println("Your random cards are:");//create introductory statement on screen
        int card1=(int) (Math.random()*53)+1;//create a card, represented as an integer
        int card2=(int) (Math.random()*53)+1;//create card 2, represented as an integer
        int card3=(int) (Math.random()*53)+1;//create card 3, represented as an integer
        int card4=(int) (Math.random()*53)+1;//create card 4, represented as an integer
        int card5=(int) (Math.random()*53)+1;//create card 5, repreesented as an integer
        //for each card, analyze the suit and number through the correct set of determination code,
        //first done in Lab 04 and replicated here.
        if(card1<=13){
            //test to see if in diamond range
            switch (card1){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 11:
                    System.out.println("You picked the jack of diamonds");//print jack  statement
                break;
                case 12:
                    System.out.println("You picked the queen of diamonds");//print queen statement
                break;
                case 13:
                    System.out.println("You picked the king of diamonds");//print king statement
                break;
                case 1:
                    System.out.println("You picked the ace of diamonds");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card1+" of diamonds");//print all other statments
                break;
            }
        }
        if(card1<=26&&card1>13){
            //test to see if in clubs range
            switch (card1){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 24:
                    System.out.println("You picked the jack of clubs");//print jack  statement
                break;
                case 25:
                    System.out.println("You picked the queen of clubs");//print queen statement
                break;
                case 26:
                    System.out.println("You picked the king of clubs");//print king statement
                break;
                case 14:
                    System.out.println("You picked the ace of clubs");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card1-13)+" of clubs");//print all other statments
                break;
            }
        }
        if(card1<=39&&card1>26){
            //test to see if in hearts range
            switch (card1){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 37:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 38:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 39:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card1-26)+" of hearts");//print all other statments
                break;
            }
        }
        if(card1>39){
            //test to see if in spades range
            switch (card1){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 51:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 52:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 53:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 39:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card1-39)+" of spades");//print all other statments
                break;
            }
        }

        if(card2<=13){
            //test to see if in diamond range
            switch (card2){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 11:
                    System.out.println("You picked the jack of diamonds");//print jack  statement
                break;
                case 12:
                    System.out.println("You picked the queen of diamonds");//print queen statement
                break;
                case 13:
                    System.out.println("You picked the king of diamonds");//print king statement
                break;
                case 1:
                    System.out.println("You picked the ace of diamonds");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card2+" of diamonds");//print all other statments
                break;
            }
        }
        if(card2<=26&&card2>13){
            //test to see if in clubs range
            switch (card2){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 24:
                    System.out.println("You picked the jack of clubs");//print jack  statement
                break;
                case 25:
                    System.out.println("You picked the queen of clubs");//print queen statement
                break;
                case 26:
                    System.out.println("You picked the king of clubs");//print king statement
                break;
                case 14:
                    System.out.println("You picked the ace of clubs");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card2-13)+" of clubs");//print all other statments
                break;
            }
        }
        if(card2<=39&&card2>26){
            //test to see if in hearts range
            switch (card2){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 37:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 38:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 39:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card2-26)+" of hearts");//print all other statments
                break;
            }
        }
        if(card2>39){
            //test to see if in spades range
            switch (card2){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 51:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 52:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 53:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 39:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card2-39)+" of spades");//print all other statments
                break;
            }
        }
        if(card3<=13){
            //test to see if in diamond range
            switch (card3){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 11:
                    System.out.println("You picked the jack of diamonds");//print jack  statement
                break;
                case 12:
                    System.out.println("You picked the queen of diamonds");//print queen statement
                break;
                case 13:
                    System.out.println("You picked the king of diamonds");//print king statement
                break;
                case 1:
                    System.out.println("You picked the ace of diamonds");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card3+" of diamonds");//print all other statments
                break;
            }
        }
        if(card3<=26&&card3>13){
            //test to see if in clubs range
            switch (card3){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 24:
                    System.out.println("You picked the jack of clubs");//print jack  statement
                break;
                case 25:
                    System.out.println("You picked the queen of clubs");//print queen statement
                break;
                case 26:
                    System.out.println("You picked the king of clubs");//print king statement
                break;
                case 14:
                    System.out.println("You picked the ace of clubs");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card3-13)+" of clubs");//print all other statments
                break;
            }
        }
        if(card3<=39&&card3>26){
            //test to see if in hearts range
            switch (card3){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 37:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 38:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 39:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card3-26)+" of hearts");//print all other statments
                break;
            }
        }
        if(card3>39){
            //test to see if in spades range
            switch (card3){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 51:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 52:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 53:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 40:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card3-39)+" of spades");//print all other statments
                break;
            }
        }

        if(card4<=13){
            //test to see if in diamond range
            switch (card4){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 11:
                    System.out.println("You picked the jack of diamonds");//print jack  statement
                break;
                case 12:
                    System.out.println("You picked the queen of diamonds");//print queen statement
                break;
                case 13:
                    System.out.println("You picked the king of diamonds");//print king statement
                break;
                case 1:
                    System.out.println("You picked the ace of diamonds");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card4+" of diamonds");//print all other statments
                break;
            }
        }
        if(card4<=26&&card4>13){
            //test to see if in clubs range
            switch (card4){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 24:
                    System.out.println("You picked the jack of clubs");//print jack  statement
                break;
                case 25:
                    System.out.println("You picked the queen of clubs");//print queen statement
                break;
                case 26:
                    System.out.println("You picked the king of clubs");//print king statement
                break;
                case 14:
                    System.out.println("You picked the ace of clubs");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card4-13)+" of clubs");//print all other statments
                break;
            }
        }
        if(card4<=39&&card4>26){
            //test to see if in hearts range
            switch (card4){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 37:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 38:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 39:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card4-26)+" of hearts");//print all other statments
                break;
            }
        }
        if(card4>39){
            //test to see if in spades range
            switch (card4){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 51:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 52:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 53:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 40:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card4-39)+" of spades");//print all other statments
                break;
            }
        }
        if(card5<=13){
            //test to see if in diamond range
            switch (card5){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 11:
                    System.out.println("You picked the jack of diamonds");//print jack  statement
                break;
                case 12:
                    System.out.println("You picked the queen of diamonds");//print queen statement
                break;
                case 13:
                    System.out.println("You picked the king of diamonds");//print king statement
                break;
                case 1:
                    System.out.println("You picked the ace of diamonds");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card5+" of diamonds");//print all other statments
                break;
            }
        }
        if(card5<=26&&card5>13){
            //test to see if in clubs range
            switch (card5){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 24:
                    System.out.println("You picked the jack of clubs");//print jack  statement
                break;
                case 25:
                    System.out.println("You picked the queen of clubs");//print queen statement
                break;
                case 26:
                    System.out.println("You picked the king of clubs");//print king statement
                break;
                case 14:
                    System.out.println("You picked the ace of clubs");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card5-13)+" of clubs");//print all other statments
                break;
            }
        }
        if(card5<=39&&card5>26){
            //test to see if in hearts range
            switch (card5){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 37:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 38:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 39:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card5-26)+" of hearts");//print all other statments
                break;
            }
        }
        if(card5>39){
            //test to see if in spades range
            switch (card5){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 51:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 52:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 53:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 40:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+(card5-39)+" of spades");//print all other statments
                break;
            }
        }
        //Next take the cards out of suit, thereby forcing the cards to have a number 1-13 which  can be compared
        //card1
        if(card1>13&&card1<=26){
            card1=card1-13;//subtrarct to normalize card
        }
        else if(card1>26&&card1<=39){
            card1=card1-26;//subtract to normalize card
        }
        else if(card1>39){
            card1=card1-39;//subtract to normalize
        }
        //card2
        if(card2>13&&card2<=26){
            card2=card2-13;//subtrarct to normalize card
        }
        else if(card2>26&&card2<=39){
            card2=card2-26;//subtract to normalize card
        }
        else if(card2>39){
            card2=card2-39;//subtract to normalize
        }
        //card3
        if(card3>13&&card3<=26){
            card3=card3-13;//subtrarct to normalize card
        }
        else if(card3>26&&card3<=39){
            card3=card3-26;//subtract to normalize card
        }
        else if(card3>39){
            card3=card3-39;//subtract to normalize
        }
        //card4
        if(card4>13&&card4<=26){
            card4=card4-13;//subtrarct to normalize card
        }
        else if(card4>26&&card4<=39){
            card4=card4-26;//subtract to normalize card
        }
        else if(card4>39){
            card4=card4-39;//subtract to normalize
        }
        //card5
        if(card5>13&&card5<=26){
            card5=card5-13;//subtrarct to normalize card
        }
        else if(card5>26&&card5<=39){
            card5=card5-26;//subtract to normalize card
        }
        else if(card5>39){
            card5=card5-39;//subtract to normalize
        }
        //System.out.println(card1+" "+card2+" "+card3+" "+card4+" "+card5); //Testing line
        //Consider combinations of cards to determine pairs
        boolean pair1 = card1==card2;
        boolean pair2 = card1==card3;
        boolean pair4 = card1==card4;
        boolean pair5 = card1==card5;
        boolean pair6 = card2==card3;
        boolean pair7 = card2==card4;
        boolean pair8 = card2==card5;
        boolean pair9 = card3==card4;
        boolean pair10 = card3==card5;
        boolean pair11 = card4==card5;
        //Consider combinations of cards to produce three of a kind
        boolean three1= (card1==card2)&&(card1==card3);
        boolean three2= (card1==card2)&&(card1==card4);
        boolean three3= (card1==card2)&&(card1==card5);
        boolean three4= (card1==card3)&&(card1==card4);
        boolean three5= (card1==card3)&&(card1==card5);
        boolean three6= (card1==card4)&&(card1==card5);
        boolean three7= (card2==card3)&&(card2==card4);
        boolean three8= (card2==card3)&&(card2==card5);
        boolean three9= (card2==card4)&&(card2==card5);
        boolean three10= (card3==card4)&&(card3==card5);
        //test for any of the hand combinations
        if(three1||three2||three3||three4||three5||three6||three7||three8||three9||three10){
            //test for three of a kind
            System.out.println("You have three of a kind!");
        }
        //test for two pairs, using multiple else if statments for organizational clarity
        else if(pair1&&pair2 || pair1&&pair4 || pair1&&pair5 || pair1&&pair6 || pair1&&pair7 || pair1&&pair8 || pair1&&pair9 ||pair1&&pair10 ||pair1&&pair11){
            //compare pair 1
            System.out.println("You have two pair!");
        }
        else if( pair2&&pair4 || pair2&&pair5 ||pair2&&pair6 ||pair2 &&pair7 || pair2&&pair8 ||pair2&&pair9 ||pair2&&pair10 ||pair2&&pair11){
            //compare pair 2
            System.out.println("You have two pair!");
        }
        else if(pair4&&pair5 ||pair4&&pair6||pair4&&pair7||pair4&&pair8||pair4&&pair9||pair4&&pair10||pair4&&pair11){
            //compare pair 4
            System.out.println("You have two pair!");
        }
        else if(pair5&&pair6 ||pair5&&pair7 ||pair5&&pair8||pair5&&pair9||pair5&&pair10||pair5&&pair11){
            //compare pair 5
            System.out.println("You have two pair!");
        }
        else if(pair6&&pair7||pair6&&pair8||pair6&&pair9||pair6&&pair10||pair6&&pair11){
            //compare pair 6
            System.out.println("You have two pair!");
        }
        else if(pair7&&pair8||pair7&&pair9||pair7&&pair10||pair7&&pair11){
            //compare pair 7
            System.out.println("You have two pair!");
        }
        else if(pair8&&pair9||pair8&&pair10||pair8&&pair11){
            //compare pair 8
            System.out.println("You have two pair!");
        }
        else if(pair9&&pair10||pair9&&pair11){
            //compare pair 9
            System.out.println("You have two pair!");
        }
        else if(pair10&&pair11){
            //compare pair 10. 
            System.out.println("You have two pair!");
        }
        //test for pair
        else if(pair1||pair2||pair4||pair5||pair6||pair7||pair8||pair9||pair10||pair11){
            System.out.println("You have a pair!");
        }
        else{
            System.out.println("You have a high card!");
            //if none of above, must have high card. 
        }

    }
}
                    



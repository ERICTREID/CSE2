//Eric Reid
//CSE 2
//9/18/2015
//This program will select a random card and display it to the screen.

public class CardGenerator{
    public static void main(String[] args){
        int card=(int) (Math.random()*53)+1;//create a random integer between 1 and 52
        System.out.println(card);
        //diamonds category
        if(card<=13){
            //test to see if in diamond range
            switch (card){
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
                    System.out.println("You picked the "+card+" of diamonds");//print all other statments
                break;
            }
        }
        if(card<=26&&card>13){
            //test to see if in clubs range
            switch (card){
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
                    System.out.println("You picked the "+card+" of clubs");//print all other statments
                break;
            }
        }
        if(card<=38&&card>26){
            //test to see if in hearts range
            switch (card){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 36:
                    System.out.println("You picked the jack of hearts");//print jack  statement
                break;
                case 37:
                    System.out.println("You picked the queen of hearts");//print queen statement
                break;
                case 38:
                    System.out.println("You picked the king of hearts");//print king statement
                break;
                case 27:
                    System.out.println("You picked the ace of hearts");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card+" of hearts");//print all other statments
                break;
            }
        }
        if(card>38){
            //test to see if in spades range
            switch (card){
                //test to see if higher than 10 or equal to one and change output accordingly
                case 50:
                    System.out.println("You picked the jack of spades");//print jack  statement
                break;
                case 51:
                    System.out.println("You picked the queen of spades");//print queen statement
                break;
                case 52:
                    System.out.println("You picked the king of spades");//print king statement
                break;
                case 39:
                    System.out.println("You picked the ace of spades");//print ace statement
                break;
                default:
                    System.out.println("You picked the "+card+" of spades");//print all other statments
                break;
            }
        }
                    
        }
        
    }

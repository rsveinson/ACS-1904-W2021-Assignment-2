import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment x
 * @Sveinson 
*/

public class Deck extends SetOfCards{
    
    // constructor
    public Deck(){
       maxCards = SIZEOFDECK;
       // load deck of card
       createCards();
       
    }
    
    // implementation of abstract methods
    public String evaluate(){
        String st = "";
        st += cards.size();
        return st;
    }
    
    // getters
    
    // setters
    
    // other
    
    /*****************************************
    * Description: create 13 cards of each suit, used in the constructor
    * 
    * ****************************************/
    private void createCards(){
        Suit[] suits = Suit.values();
        Face[] faces = Face.values();
        
        for(int i = 0; i < suits.length; i++)
            for(int j = 0; j < faces.length; j++)
                this.addCard(new Card(suits[i], faces[j]));
    }// end create cards
        

    /*****************************************
    * Description: deal one card off the top of the deck (or off the bottom
    *               if you're Yosemite Sam. Reduces the deck size by one
    * 
    * @return       Card    the top card of the deck
    * ****************************************/
    public Card deal(){
        return cards.remove(0);
    }// end deal
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

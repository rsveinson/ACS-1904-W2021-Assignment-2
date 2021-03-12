/** 
 * ACS-1904 Assignment 2
 * @Sveinson
 * 
 * Abstract Class SetOfCards
 * 
 * one or more crad objects. includes a data structrure (in this case an array list)
 * and a file for the maximium allowable number of cards in the set.
*/
import java.util.ArrayList;

public abstract class SetOfCards{
    
    // instance variables
    private int maxCards;       // max cards in this set, will be initialized in
                                // the concrete class constructor
    private ArrayList<Card> cards;
    
    // constructors
    public SetOfCards(){
        cards = new ArrayList<>();
    }// end no-arg constructor
    
    // abstract method must be implemented in derived classes
    public abstract String evaluate();
    
    // getters
    /*****************************************
    * Description: get a pointer to the set of cards array list
    * 
    * @return       Cards   pointer to the array list of cards
    * ****************************************/
    public ArrayList<Card> getCards(){
        return cards;
    }// end getCards
    
    // setters
    /*****************************************
    * Description: set the pointer to the array list of cards
    * 
    * @param       ArrayList() pointer to an ArrayList of cards
    * ****************************************/
    public void setCards(ArrayList<Card> c){
        assert c.size() <= maxCards : c.size() + " is too many cards.";
        cards = c;
    }// end setCards 
    
    // other
    /*****************************************
    * Description: add a card to the set of cards. should not cause the set to 
    *               exceed its max size
    * 
    * @param       Card c the card object to add to the set
    * ****************************************/
    public void addCard(Card c){
        assert cards.size() <= maxCards -1 : "if you add this card you will exceed the max size of this set of cards.";
        cards.add(c);
    }// end addCard


}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

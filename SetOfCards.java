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
import java.util.Collections;

public abstract class SetOfCards{
    // some constants
    protected final int SIZEOFDECK = 52;
    protected final int SIZEOFHAND = 6;
    
    // instance variables
    protected int maxCards;       // max cards in this set, will be initialized in
                                // the concrete class constructor
    protected ArrayList<Card> cards;
    
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
        assert cards.size() < maxCards : "if you add this card you will exceed the max size of this set of cards.";
        cards.add(c);
    }// end addCard

    /*****************************************
    * Description: override toString to return a string of of
    *               all of the cards in the set
    * 
    * @return       String a list of all the cards in the set
    * ****************************************/
    @Override
    public String toString(){
     int counter = 1;
     StringBuilder st = new StringBuilder();   
     
     for(Card c : cards){
         st.append(c);
         if(counter++ == 13){
             st.append("\n");
             counter = 1;
         }// end 14 cards printed
            
     }
  
     return st.toString();
    }// end toString
    
    /*****************************************
    * Description: shuffle the deck of cards, actually simply randomize 
    *              the order of the cards in the array list
    * 
    * ****************************************/
    public void shuffle(){
        Collections.shuffle(cards);
    }// end shuffle
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

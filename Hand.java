
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
 * 
 * Hand class: one hand of cards, max size taken from a constant
 *              defined in set of cards
 *              the hand can be set by the constructor or by adding
 *              cards one at a time
*/

public class Hand extends SetOfCards{
    // use the cards arrauy list form SetOfCards
    // int maxCards from SetOfCards
    
    // constructors
    public Hand(){
        super();            // creates the arraylist that will hold the 6 cards
        maxCards = SIZEOFHAND;
    }// end no-arg constructor
    
    /*****************************************
    * Description: create a Hand object with 6 cards already present
    *              since the array list of cards is aparameter we might as well
    *              throw an illegal argument exception if it is too big (or too small)
    * 
    * @param        ArrayList<Card> an arraylist of cards containg no more than 
    *                               6 cards.                               
    * ****************************************/
    public Hand(ArrayList<Card> c){
        if(c.size() > SIZEOFHAND)
            throw new IllegalArgumentException("too many cards");
            
        maxCards = SIZEOFHAND;
        setCards(c);
    }// end initialized constructor
    
    // abstract method implementation
    /*****************************************
    * Description: evaluates the point value of the hand
    * 
    * @return       String: the hand and the point value
    * ****************************************/
    public String evaluate(){
        StringBuilder st = new StringBuilder();
        int value = 0;
        int deduct = 0;        // amount to deduct if column pairs are present
        
        // add the representation of the hand to the output
        st.append(this.toString());
        
        // add up the card values
        for(Card c: cards)
            value += c.getFace().getPoints();
        //System.out.println(value); 
        
        // account for column pairs
        /* index 0 and index 3 are a column
         * index 1 and index 4 are a column
         * index 2 and index 5 are a column
         * 
         * I left the System.out.println statements in here so you could see how I evaluated the calculations
         */
        deduct += cards.get(0).getFace() == cards.get(3).getFace() ? (cards.get(0).getFace().getPoints() * 2): 0;
        //System.out.println(deduct);
        deduct += cards.get(1).getFace() == cards.get(4).getFace() ? (cards.get(1).getFace().getPoints() * 2): 0;
        //System.out.println(deduct);
        deduct += cards.get(2).getFace() == cards.get(5).getFace() ? (cards.get(2).getFace().getPoints() * 2): 0;
        //System.out.println(deduct); 
        
        value -= deduct;
        //System.out.println(value); 
        
        st.append("Score: " + value + "\n");
        return st.toString();
    }// end evaluate
    
    // getters
    
    // setters
    
    //other
    /*****************************************
    * Description: override toString to return a string of 
    *               a 2 row by 3 column hand of cards
    * 
    * @return       String a 2x3 representation of a hand of cards 
    * ****************************************/
    @Override
    public String toString(){
     int counter = 1;
     StringBuilder st = new StringBuilder();   
     
     for(Card c : cards){
         st.append(c  + "\t");
         if(counter++ == 3){
             st.append("\n");
             counter = 1;
         }// end  cards printed
            
     }// end for
  
     return st.toString();
    }// end toString

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

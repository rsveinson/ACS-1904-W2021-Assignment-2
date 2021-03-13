import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
/** 
 * ACS-1904 Assignment x
 * @Sveinson 
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
    public String evaluate(){
        String st = "evaluating";
        
        return st;
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
            
     }
  
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

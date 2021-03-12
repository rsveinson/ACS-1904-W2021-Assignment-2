
/**
 * Enumeration class Suit: as in suit of a card, Clubs, Spades, Diamonds and hearts 
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Suit
{
    CLUBS("\u2663"), SPADES("\u2660"), HEARTS("\u2665"), DIAMONDS("\u2666");
            
    private String display;
    
    // constructor
    private Suit(String d){
        display = d;
    }
    
    public String getDisplay(){
        return display;
    }
}

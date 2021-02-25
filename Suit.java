
/**
 * Enumeration class Planets - write a description of the enum class here
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

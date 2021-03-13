import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class SixCardGolf{
    public static void main(String[] args)throws FileNotFoundException {
        
        Deck deck = new Deck();
        Hand p1 = new Hand();
        Hand p2 =  new Hand();
        Hand p3 = new Hand();
        
        deck.shuffle();
        
        ArrayList<Card> th = new ArrayList();
        for(int i = 0; i < 6; i++)
            th.add(deck.deal());
            
        Hand p4 = new Hand(th);
        
        for(int i = 0; i < 6; i++){
            p1.addCard(deck.deal());
            p2.addCard(deck.deal());
            p3.addCard(deck.deal());
        }//end for (load hands 1-3_
        
        // display the hands
        System.out.println("Player 1:");
        System.out.println(p1.evaluate());
        
        System.out.println("Player 2:");
        System.out.println(p2.evaluate());
        
        System.out.println("Player 3:");
        System.out.println(p3.evaluate());
        
        System.out.println("Player 4:");
        System.out.println(p4.evaluate());
        
        System.out.print("Number of cards remaining in deck: ");
        System.out.println(deck.evaluate());


        System.out.println("end of program");
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

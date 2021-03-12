import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class TestDriver{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        Card c1 = new Card(Suit.valueOf("CLUBS"), Face.valueOf("K"));
        Card c2 = new Card(Suit.valueOf("HEARTS"), Face.valueOf("TEN"));
        Card c3 = new Card(Suit.valueOf("DIAMONDS"), Face.valueOf("A"));
        Card c4 = new Card(Suit.valueOf("SPADES"), Face.valueOf("TWO"));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        
        


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

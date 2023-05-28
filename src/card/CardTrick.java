 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           c.setValue((int)(Math.random()*13+1));
           c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
           magicHand[i] = c;
           System.out.println(magicHand[i].getSuit()+""+ magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, 
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter card value(1-13):");
        int value = Keyboard.nextInt();
        Keyboard.nextLine();
        System.out.println("Enter card suit Hearts, Diamonds, Spades, Clubs:-");
        String suit = Keyboard.nextLine();
        //create their card
         Card userCard = new Card();
         userCard.setValue(value);
         userCard.setSuit(suit);
        // and search magicHand here
        boolean search = false;
        for(Card card : magicHand)
        {
            if(card.getValue()== userCard.getValue()&& card.getSuit().equals(userCard.getSuit()));
            search = true;
            break;
            
        }
        //Then report the result here
        if (search)
            
        {
            System.out.println("The magic hand contains your card!");
            
        }else
        {
            System.out.println("The magic hand does not contain your card");
        }
    }
    
}

package chapter_1.exercise_4;

import java.util.Arrays;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 *
 * Exercise Link
 * @link - https://introcs.cs.princeton.edu/java/13flow/
 *
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - Write a program Deal.java that takes an integer command-line argument n
 * and prints n poker hands (five cards each) from a shuffled deck, separated by blank lines.
 *
 ************************************************************************************/
public class Deal {
    public static void main(String[] args) {
        // input the hands
        int n = Integer.parseInt(args[0]);
        // create deck
        String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] Deck = new String[Ranks.length * Suits.length];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                Deck[i + Ranks.length * j] = Ranks[i] + Suits[j];
            }
        }

        // shuffle deck
        int len = Deck.length;
        for (int i = 0; i < len; i++) {
            int r = i + (int) (Math.random() * (len - i));
            String temp = Deck[i];
            Deck[i] = Deck[r];
            Deck[r] = temp;
        }

        // deal cards
        if (n <= 10) {
            int cardsDealt = 0;
            for (int i = 0; i < len; i++) {
                cardsDealt++;
                System.out.print(Deck[i] + " ");
                if (cardsDealt % 5 == 0) System.out.println();
                if (cardsDealt == n * 5) break;
            }
        } else {
            System.out.println("Not enough cards in the deck");
        }
    }
}

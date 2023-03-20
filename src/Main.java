import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int wrong = 0;
        String word = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Hangman Program!");

        // Read in the input file name from the user.
        System.out.println("What is the name of the file with all of the words?");
        String file = sc.next();

        // Open the file
        Scanner fin = new Scanner(new File(file));

        // Read the first int from file
        int n = fin.nextInt();

        // prompt the user for which word to use in the game
        System.out.println("What number word, from 1 to 5, do you want to use?");
        int numwords = sc.nextInt();

        for (int i = 0; i < numwords; i++){
             word = fin.next();
        }

        // Move the word to the board
        String board = "";
        for (int i = 0; i < word.length(); i++){
            board += '_';
        }


        // START THE GAME
        while (wrong < 5){

            // print the board
            System.out.println("Here is the board: ");
            for (int i = 0; i < board.length(); i++){
                System.out.print(board.charAt(i)+ " ");
            }

            // get a char input from user
            System.out.println("What is your guess? ");
            String c = sc.next();

            if (word.contains(c)){
                System.out.println("Good job!");

                // count how many occurences of the char is in the secret word

                // using for loop, generate new strings newWord with the new char and the rest of the letter in _

                // board = newWord;

            } else {
                System.out.println("Sorry, that letter is not in the word. ");
                wrong += 1;
            }

        }

        System.out.println("Heres' the final board: " + board);


        // close the file
        fin.close();

    } // end driver
}
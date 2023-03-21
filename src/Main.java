/* 3/20/2020
* Name: Deodatus Marcellino
* -------------------------- Hangman ------------------
* This program implements the game hangman, without the actual picture of the hangman. The rules of the game are as follows:
* 1) There is a secret word to guess. (this will be read from words.txt)
* 2) The user is displayed blanks representing the letters in the word at the beginning of the game.
* 3) For each turn, the user guesses a letter. If there is at least one occurence of the letter in the secret word, then for the next
* turn, each occurence of the letter is revealed. (Thus, in the middle of the game, the word shown is a mixture of letters and blanks.
* The blanks indicating the locations of letters that haven't been guessed yet by the user.) If there is no occurence of the letter guessed,
* then one is added to a tally keeping track of how many "bad guesses" have been made.
* 4) The game ends when either the user has uncovered each letter in the word (in which case he/she wins)
* OR
* when the user has made five bad guesses before each of the letters in the word have been uncovered (in which case he/she loses).
*/
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

        // Initialize the board
        char []answer = new char[word.length()];
        char []board = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            answer[i] = word.charAt(i);
            board[i] = '_';
        }
        String update = String.valueOf(board);

        // START THE GAME
        while (wrong < 5){

            if(update.contains("_") == false){
                break;
            }

            // print the board
            System.out.println("Here is the board: ");
            for (int i = 0; i < word.length(); i++){
                System.out.print(board[i]+" ");
            }
            System.out.println();
            // get a char input from user
            System.out.println("What is your guess? ");
            String c = sc.next();

            if (word.contains(c)){
                System.out.println("Good job!");
                char ch = c.charAt(0);
                char ch_upper = Character.toUpperCase(ch);
                for(int i = 0; i < word.length(); i++){
                    if(answer[i] == ch){
                        board[i] = ch_upper;
                    } else if(answer[i] == ch_upper) {
                        board[i] = ch_upper;
                    }
                }

                update = String.valueOf(board);

            } else {
                System.out.println("Sorry, that letter is not in the word. ");
                wrong++;
            }

        }

        if (wrong == 5){
            String ans = String.valueOf(answer);
            System.out.println("Sorry, you have not guessed the correct word in time.");
            System.out.println("The correct word was " +ans);
        } else {
            System.out.println("Heres' the final board: " +update);
        }

        // close the file
        fin.close();

    } // end driver
}
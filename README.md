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

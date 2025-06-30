package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int secretNumber = (int)(Math.random() * 5) + 1;
        int guessCount = 1;
        int userGuess = 0;
        Scanner myObj = new Scanner (System.in);

        System.out.println("I'm thinking of a number between 1 and 5.");
        while (guessCount < 4){
            System.out.printf("Guess %d: ", guessCount);
            userGuess = myObj.nextInt();
            if (userGuess == secretNumber){
                System.out.println("You guessed it!");
                System.out.println("You win!");
                break;
            }else{
                if(guessCount == 3){
                    System.out.printf("You lose. The correct number was %d.", secretNumber);
                }else {
                    System.out.println("Wrong guess.");
                }
            }
            guessCount++;
        }


    }
}
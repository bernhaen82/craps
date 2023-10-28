import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
    int   dieOff = rnd.nextInt(6);
        int die = rnd.nextInt(6) + 1;
        int points = 0;
        int dice1 = 0;
        int dice2 = 0;
        int crapsRoll = 0;
        boolean gameOver = false;
        boolean done = false;
        String roll = "";
        String rightInput = "R";
        boolean rolled = false;
        boolean donePlaying = false;
        boolean valid = false;
        do {
            do {
                do {
                    System.out.println("Roll the dice with R key");
                    Scanner in = new Scanner(System.in);
                    roll = in.nextLine();
                    if (roll.equalsIgnoreCase(rightInput)) {
                        rolled = true;
                        dice1 = rnd.nextInt(6) + 1;
                        System.out.println("Dice 1: " + dice1);
                        dice2 = rnd.nextInt(6) + 1;
                        System.out.println("Dice 2: " + dice2);
                    } else {
                        System.out.print("invalid input");
                    }
                    crapsRoll = dice1 + dice2; // Gaussian range from 2 to 12 as in rolling two dice
                    String playAgain = "";
                    if (crapsRoll == 2) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlaying = true;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlaying = false;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 3) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("You have: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlaying = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlaying = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 12) {
                        System.out.println("craps");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Do you want to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlaying = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlaying = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 7) {
                        System.out.println("natural");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlaying = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlaying = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else if (crapsRoll == 11) {
                        System.out.println("natural");
                        gameOver = true;
                        System.out.println("Your points: " + points);
                        System.out.println("Would you like to play again? [Y,N]: ");
                        do {
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("Y")) {
                                valid = true;
                                donePlaying = false;
                            } else if (playAgain.equalsIgnoreCase("N")) {
                                valid = true;
                                donePlaying = true;
                            } else {
                                valid = false;
                            }
                        }
                        while (!valid);
                    } else {
                        points = points + crapsRoll;
                        System.out.println("Your points: " + points);
                    }
                }
                while (!donePlaying);
            }
            while (!rolled);
        }
        while (!gameOver);
    }
}

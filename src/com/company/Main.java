package com.company;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int total;
//        int newTotal;
//        Die die = new Die();
//        Die die2 = new Die();
//
//
//        die.roll();
//        die2.roll();
//
//        total = die.faceUpValue + die2.faceUpValue;
//
//        System.out.println(die.faceUpValue + " + " + die2.faceUpValue + " = " + (die.faceUpValue + die2.faceUpValue));
//        System.out.println("Will the next number be higher or lower?");
//        String input = scanner.next();
//
//        die.roll();
//        die2.roll();
//
//        newTotal = die.faceUpValue + die2.faceUpValue;
//
//        boolean isLarger = newTotal > total;
//
//        System.out.println(die.faceUpValue + " + " + die2.faceUpValue + " = " + (newTotal));
//        if (total == newTotal) {
//            System.out.println("same number you lose - loser!");
//            return;
//        }
//
//        System.out.println(isLarger ? "Number is higher" : "Number is lower");
//
//
//
//        boolean didWin = false;
//        if (input.equals("h")) {
//            if (isLarger) {
//                didWin = true;
//            }
//        } else {
//            if (!isLarger) {
//                didWin = true;
//            }
//        }
//        System.out.println(didWin ? "You Win!" : "You Lose Sucka!");
//
//        scanner.close();
//    }
//}

        Scanner scanner = new Scanner(System.in);
        int total;
        int newTotal;
        boolean newLoop = true;
        Die die = new Die();
        Die die2 = new Die();

        while (newLoop) {
            die.roll();
            die2.roll();

            total = die.faceUpValue + die2.faceUpValue;

            System.out.println(die.faceUpValue + " + " + die2.faceUpValue + " = " + (die.faceUpValue + die2.faceUpValue));
            System.out.println("Will the next number be higher or lower?");
            String input = scanner.next();

            die.roll();
            die2.roll();

            newTotal = die.faceUpValue + die2.faceUpValue;

            boolean isLarger = newTotal > total;

            System.out.println(die.faceUpValue + " + " + die2.faceUpValue + " = " + (newTotal));
            if (total == newTotal) {
                System.out.println("same number you lose - loser!");
                return;
            }

            System.out.println(isLarger ? "Number is higher" : "Number is lower");


            //boolean didWin = false;
            if (input.equals("h")) {
                if (isLarger) {
                    System.out.println("You win - go again");
                }
            } else if (input.equals("l")) {
                if (!isLarger) {
                    System.out.println("You win - go again");
                } else {
                    newLoop = false;
                    System.out.println("Game over - you lose - LOSER!");
                }

            }

        }
    }
}

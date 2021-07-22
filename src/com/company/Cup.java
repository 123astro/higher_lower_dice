package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cup {
    List<Die> dice = new ArrayList<>();  // create a list(inside of cup)to hold the dice

    public Cup() { // the constructor to create the five dice needed for yahtzee. 0-4
        while (dice.size() < 5) {  //
            dice.add(new Die());  // using the default constructor with 6 sided dice.
        }
    }
    // we have our methods of the class cup below.


    public void roll() {   //roll all dice (this method needs to be created = like real life.
        for (Die die : dice) {  // for-in-loop to use all dice in the list
            die.roll();
        }
    }

    public void roll(int selection) {  //roll an individual die
        Die tempDie = dice.get(selection); // working in the list
        tempDie.roll();// we can get to roll with the new tempDie
        //dice.get(selection).roll();  // is the easier refactored way
    }


    public void roll(List<Integer> selections) {  // use List<Integer> to roll many dice.
        for (int selection : selections) {
            roll(selection); // roll inside of same class
        }
    }

    public String displayCup() {  // display used for end user
        String output = ""; // assign output a blank string
        for (Die die : dice) {
            output += die.faceUpValue + " ";
        }
        return output.trim();
    }

    public List<Integer> parseDiceToReroll(String input) {
        String[] inputArr = input.split(" "); //["1", "2", "3"]
        List<Integer> selections = new ArrayList<>();
        for (String number : inputArr) {
            selections.add(Integer.parseInt(number) - 1);
        }
        return selections;
    }
}


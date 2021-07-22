package com.company;

import java.util.Scanner;

public class Yahtzee {
    // public Cup myCup = new Cup();  // went in player.
    public Player player;  //the constructor in player
    private Scanner scanner = new Scanner(System.in);

    public Yahtzee() {
        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//        player = new Player(name);
        player = new Player((scanner.nextLine()).trim());
    }

    // TODO refactor play to run 5 turns then display total score
    public void play() {
        int i = 0;
        while (i < 5) {
            turn();
            i++;
        }
        System.out.println(player.score);
    }

    public void getSelections() {
        System.out.println("Select dice you want to re-roll (1-5) ?");
        String input = scanner.nextLine(); // "1 2 5"
        player.cup.roll(player.cup.parseDiceToReroll(input)); // adding ints to roll to re-roll those dice
    }

    // TODO refactor(update a method)  turn to update score and display round score * (and total score)
    public void turn() {
        player.cup.roll();

        for (int i = 0; i < 2; i++) {
            System.out.println(player.cup.displayCup());
            getSelections();
        }
        System.out.println(player.updateScore());
        System.out.println(player.cup.displayCup());

    }

}


//        Cup myCup = new Cup();
//          myCup.roll();
//          System.out.println(myCup.displayCup());
//          myCup.roll(3);
//          System.out.println(myCup.displayCup());
//          myCup.roll(3);
//          System.out.println(myCup.displayCup());
//          myCup.roll(3);
//          System.out.println(myCup.displayCup());
//        Scanner scanner = new Scanner(System.in);
//        String input;  // ????
//        myCup.roll();
//        System.out.println(myCup.displayCup());
//        System.out.println("Which die do you want to re-roll (1-5) ?");
//        input = scanner.nextInt();
//        myCup.roll(input - 1);  // 1-5 0-4
//        System.out.println(myCup.displayCup());
//        myCup.roll();
//        System.out.println(myCup.displayCup());
//        System.out.println("Select dice you want to re-roll (1-5) ?");
//        input = scanner.nextLine(); // "1 2 5"
//        input.split(" "); // need to split
//        String[] inputArr = input.split(" "); // ["1", "2", "3"]
//        System.out.println(inputArr.length);  // check if we are receiving all data
//        String[] needs to become a List<Interger>
//        List<Integer> selections = new ArrayList<>();
//        for (String number : inputArr){
//            selections.add(Integer.parseInt(number) - 1);
//        }
//        myCup.roll(myCup.parseSelections(input));
//        System.out.println(myCup.displayCup());
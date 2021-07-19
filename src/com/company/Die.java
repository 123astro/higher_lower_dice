package com.company;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void roll() {    // mosh thank you!
        //System.out.println((Math.round(Math.ceil(Math.random() * numberOfSides))));
        faceUpValue = ((int) (Math.random() * numberOfSides) + 1 ) ;
    }
    // Math.round
    // max Inclusive = Math.round(random)
}

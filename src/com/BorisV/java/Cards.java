package com.BorisV.java;

public class Cards {

    int myValue;
    String mySuit;

    public Cards (int val, String suit) {
        //setter method for value and suit of card
        myValue = val;
        mySuit = suit;
    }

    public int getValue() {
        //getter method for the value of your card
        return myValue;
    }

    public String getSuit() {
        //getter method for the value of your card
        return mySuit;
    }

    public String toString() {
        //assigning specific names to certain values in cards.
        String output = "";
        if (myValue == 1)
            return "Ace" + mySuit;
        if (myValue == 11)
            return "Jack" + mySuit;
        if (myValue == 12)
            return "Queen" + mySuit;
        if (myValue == 13)
            return "King" + mySuit;
        else
            output += Integer.toString(myValue) + mySuit;
        return output;
    }
}

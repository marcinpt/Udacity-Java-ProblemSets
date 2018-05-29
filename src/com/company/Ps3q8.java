/*Deﬁne a function called monopolyRoll(). This function provides a random result based on
the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
dice to determine their move. If they roll the same value on both dice, this is called “rolling
doubles,” and it means they go again. In our simpliﬁed version, the dice-roll function should
behave like this:
1. Generate two random integers in the 1 to 6 range.
2. If the numbers are not the same, return the sum.
3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
and return the sum of all 4 numbers.
Hint: to make your code neater, you can deﬁne a second function that generates a random
integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
need to keep repeating that code.*/

package com.company;

public class Ps3q8 {

    public int rzutKostka() {
        double liczbaLos = Math.random() * 6 + 1;
        return (int) liczbaLos;
    }

    public int rzucamy() {
        int kostka1 = rzutKostka();
        int kostka2 = rzutKostka();
        int suma = kostka1 + kostka2;

        if(kostka1 == kostka2) {
            int kostka3 = rzutKostka();
            int kostka4 = rzutKostka();
            suma =  suma + kostka3 + kostka4;
        }
        return suma;

    }
}

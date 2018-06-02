/*A savings account yields 5% interest annually. This Java function is designed to determine
how many years it will take for you to have $1,000,000 on deposit given an initial value. The
parameter represents the initial deposit, and the function should return an integer number
of years before there will be $1,000,000 or more in the account. Write a loop to determine
the number of years, and return that value.
(Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
or a while loop is more appropriate?)*/

package com.company;

public class Ps4q4 {

    public int yearsTilOneMillion(double initialBalance) {
        double total = initialBalance;
        int years = 0;

        while (total < 1000000.0) {
            total *= 1.05;
            years += 1;
        }

        return years;
    }
}

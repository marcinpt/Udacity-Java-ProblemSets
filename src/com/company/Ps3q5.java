/*Write a Java function named calculateTip(). The access modiﬁer should be public,
it should have a return type of double, and it should take as input a double parameter
representing the cost of a meal at a restaurant. And ﬁnally, it should return a double equal
to 15% of the cost parameter.*/

package com.company;

public class Ps3q5 {

    public double calculateTip(double cost) {
        double tip = cost * 0.15;
        return tip;
    }
}

/*Write a Java function called absoluteValue(). The access modiﬁer should be public, it
should have a return type of double, and it should take one double parameter as input. If
the double parameter is less than 0, it should return that number negated. Otherwise, it
should return the parameter unchanged.*/

package com.company;

public class Ps3q4 {

    public double absoluteValue(double x) {
        if(x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}


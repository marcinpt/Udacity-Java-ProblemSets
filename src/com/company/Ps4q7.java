/*What will be printed by this block of Java code?
*/

package com.company;

public class Ps4q7 {
    int rows = 3;
    for(int i = 1; i <= rows; i++) {
        String thisRow = "";
        for (int j = 0; j < i; j++) {
            thisRow = thisRow + "#";
        }
        System.out.println(thisRow);
    }
}

/*
Odp:
#
##
###
*/
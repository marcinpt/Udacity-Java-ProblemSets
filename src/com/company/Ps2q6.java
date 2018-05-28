/* 
Assume you have access to an integer variable called dayOfTheWeek and a boolean variable
called holiday, which is true when it is a holiday and false on normal days. Write Java
code that prints “Wake up at 7:00” on weekdays that are not holidays, and prints “Sleep
in!” on weekends and holidays. For the variable dayOfTheWeek, use this key:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday 
 */

package com.company;

public class Ps2q6 {
    public static void main(String[] args){

        int weekday = 5;
        boolean holiday = false;

        if(!holiday || weekday >=1 && weekday <=5){
            System.out.println("Wake up at 7:00!");
        } else {
            System.out.println("Sleep in!");
        }

    }
}
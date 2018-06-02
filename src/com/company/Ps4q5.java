/*Complete the Java function below to print out all the Strings in the String array parameter
in reverse order. (The String at the highest index should be printed ﬁrst, then the String at
the next highest index, and so on. The String at index 0 should be printed last.)
For example, if a String array called weekdays had value
{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
then this function call:
printInVerverse(weekdays);
would print:
Friday
Thursday
Wednesday
Tuesday
Monday*/

package com.company;

public class Ps4q5 {
    public void printInReverse(String[] stringArray) {
        for(int i = 1; i < stringArray.length; i++) {
            System.out.println(stringArray[stringArray.length - i]);
        }
    }
}

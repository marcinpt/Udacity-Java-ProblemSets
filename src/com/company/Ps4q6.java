/*Complete the function below, which ﬁnds the range covered by an integer array. Inside
the function, ﬁnd the smallest value in the parameter array, and ﬁnd the largest value, and
return the largest value minus the smallest value. If the array has length 0, return -1.
For example, if the variable myIntArray had the value
{1, 0, 2, 3, -1, 2}
then the function call
findRange(myIntArray)
would return 4. The largest value in the array is 3, the smallest value is -1, and 3−(−1) = 4.*/

package com.company;

public class Ps4q6 {

    public int findRange(int[] intArray) {

        int max = intArray[0];
        int min = intArray[0];

        if (intArray.length > 0) {

            for (int i = 1; i <= intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
            return max - min;

        } else {
            return -1;
        }
    }
}

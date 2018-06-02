/*Complete the factorial() function below. It should return the product of all the numbers
from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.*/

package com.company;

public class Ps4q2 {
    public int factorial(int n) {
        int total = 1;
        for(int x=1; x <= n; x++) {
            total *= x;
        }
        return total;
    }
}

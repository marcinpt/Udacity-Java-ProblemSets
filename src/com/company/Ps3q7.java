/*Deﬁne two functions. The ﬁrst should be called fahrenheitToCelsius(). It should be
a public function with return type double that takes a double argument that represents a
temperature in Fahrenheit degrees. It should return the equivalent temperature in Celsius
degrees. (To convert from Fahrenheit to Celsius, use the formula C = (F − 32) × 5/9.)
Next, deﬁne a function called printTemperature(). It should be public, it should have a
return type of void, and it should take a double parameter that represents a temperature in
Fahrenheit degrees. This function should print “F: ” followed by the Fahrenheit parameter,
then “C: ” followed by the equivalent value in Celsius degrees. Use the ﬁrst function you
deﬁned to calculate the appropriate Celsius value inside the second function.
Bonus challenge: write javadoc comments for both functions.*/

package com.company;

public class Ps3q7 {

    /**
     * Funkcja przelicza stopnie F na stopnie C
     *
     * @param degF parametr wej funkcji - stopnie F
     * @return stopnie C jako double
     * */
    public double fahrenheitToCelsius(double degF) {
        double degC = (degF - 32) * 5/9;
        return degC;
    }

    /**
     * Funkcja drukuje odpowieniki st C dla st F
     * Wykozystuje wczesniejsza zdefiniowana funkcje fahrenheitToCelsius()
     * @param dF param wej stopnie F
     * */
    public void printTemperature(double dF) {
        System.out.println("F: " + dF + "C: " + fahrenheitToCelsius(dF));
    }
}

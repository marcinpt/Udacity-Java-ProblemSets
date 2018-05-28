/*Find the error in this Java code. (Hint: think about scope!)
Imagine that the variables rewinding and playbackPosition could have diﬀerent values
depending on the situation.*/

package com.company;

public class Ps2q7 {
    public static void main(String[] args) {

        double playbackPosition = 120;
        boolean rewinding = true;
        if (rewinding) {
            double rewindAmount = 0.1;
        }
//        playbackPosition = playbackPosition - rewindAmount;
//        powyzej jest blad
    }
}

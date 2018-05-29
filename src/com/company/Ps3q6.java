/*Write a Java function called nametagText(). The access modiﬁer should be public, the
return type should be String, and it should take a String parameter called name. In the
body of the function, return the String “Hello, my name is ” with the name parameter added
to the end. (Hint: use String concatenation.)*/

package com.company;

public class Ps3q6 {

    public String nametagText(String name) {
        String hello = "Hello, my name is " + name + ".";
        return hello;
    }
}

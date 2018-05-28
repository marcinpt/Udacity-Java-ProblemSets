/*Assume the int variable dayOfWeek has some value, and that it follows this rule:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
Declare a String variable called schedule and write a switch statement that gives schedule
a diﬀerent value based on the day of the week. For Monday, give it the value “Gym in the
morning.” For Tuesday give it the value “Class after work.” For Wednesday, give it the value
“Meetings all day.” For Thursday give it the value “Work from home.” For Friday, give it
the value “Game night after work.” For Saturday and Sunday, give it the value “Free!” This
should also be the default value.
OR (optional): decide what to assign schedule for each day based on your own weekly
schedule!

TODO: declare a String variable called schedule.
TODO: write a switch statement that give schedule a different
value for each day of the week based on the dayOfWeek variable.
Don’t forget to "break" after each case, and don’t forget to
provide a default case!*/

package com.company;

public class Ps2q8 {
    public static void main(String[] args) {

        //Assume this can have any value from 1 to 7:
        int dayOfWeek = 1;
        String schedule;

        switch(dayOfWeek) {
            case 1:
                schedule = "Gym";
                break;
            case 2:
                schedule = "Course";
                break;
            case 3:
                schedule = "Film";
                break;
            case 4:
                schedule = "Game";
                break;
            case 5:
                schedule = "Dinner";
                break;
            default:
                schedule = "Free";

               /* Tip: when you have several identical cases, you can
                list them together like this, or you could just list
                "default" and let it catch any case not covered
                above.
            case 6: case 7: default:
                schedule = "Free!";
                break;*/
        }
    }
}

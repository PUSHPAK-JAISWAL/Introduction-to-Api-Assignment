// this is a class to show the use of enum in java
// this is a class for example of Q4 of introdution of java Assignment
import java.util.*;

enum WEEK
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Q4ex
{
    public static void main(String args[])
    {
        for (WEEK day : WEEK.values())
        {
            System.out.println(day);
        }
    }
}

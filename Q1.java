// this is a program to solve the question one of the assignment of Introdution to Api
//program to display current date and time
import java.time.*;
public class Q1
{
    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);

    }
}
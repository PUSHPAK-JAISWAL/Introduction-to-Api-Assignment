// this is a program to solve the Q2 of the introduction to api assignment
// this is a program to print the date int MM/DD/YYYY format
import java.time.*;

class FormatDate 
{
    int month;
    int date;
    int year;

    void getMonth(int month) 
    {
        this.month = month;
    }

    void getDate(int date) 
    {
        this.date = date;
    }

    void getYear(int year) 
    {
        this.year= year;
    }

    @Override
    public String toString()
    {
        return month+"/"+date+"/"+year;
    }
}

public class Q2 
{
    public static void main(String args[]) 
    {
        LocalDate ld = LocalDate.now();
        FormatDate fd = new FormatDate();
        fd.getDate(ld.getDayOfMonth());
        fd.getMonth(ld.getMonthValue());
        fd.getYear(ld.getYear());
        System.out.println(fd.toString());
    }
}

// this is a program to show the difference between stream and collection 
// this is a example of the Q3 of the introduction to api assignment
import java.util.*;
import java.io.*;

public class Q3ex
{
    public static void main(String args[])
    {
        Stream();
        Collection();
    }
    static void Stream()
    {
        // this method will show the use of stream
        List<String> name = new ArrayList<String>();
        name.add("Pushpak");
        name.add("Mahendra");
        name.add("Seema");
        name.add("Sumit");
        Comparator<String> com = (String s1 , String s2) -> s1.compareTo(s2);
        Collections.sort(name,com);
        for(String n:name)
        {
            System.out.println(n);
        }
    }
    static void Collection()
    {
        // this method will show the use of Collections
        List<String> name = new ArrayList<String>();
        name.add("Pushpak");
        name.add("Mahendra");
        name.add("Seema");
        name.add("Sumit");
        name.stream().sorted().forEach(System.out::println);
    }
}
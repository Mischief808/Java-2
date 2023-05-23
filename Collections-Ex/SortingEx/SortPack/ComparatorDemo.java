package SortPack;
import java.util.*;
public class ComparatorDemo implements Comparator
{
    public int compare(Object o1, Object o2) 
    {
        String s1 = (String)o1;
        String s2 = (String)o2;
        //Descending order
        if(s1.length() > s2.length())
        return -1;
        else if(s1.length() < s2.length())
        return 1;
        else 
        return 0;
        //Ascending order
        // if(s1.length() > s2.length())
        // return -1;
        // else if(s1.length() < s2.length())
        // return 1;
        // else 
        // return 0;
    }
   
}
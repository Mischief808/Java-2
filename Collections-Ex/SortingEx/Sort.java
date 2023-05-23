import java.util.Arrays;
import java.util.Comparator;
import SortPack.*;
class Sort
{
    public static void main(String a[])
    {
        String[] bike = {"Kawasaki","BMW","Ducati","Yamaha"};
        System.out.println("..........Before Sorting..........");
        for(String b:bike)
        {
            System.out.println(b);
        }
        System.out.println("...........AFter Sorting using Comparator..........");
        Comparator com = new ComparatorDemo();
        Arrays.sort(bike,com);
        for(String b:bike)
        {
            System.out.println(b);
        }
    }
}
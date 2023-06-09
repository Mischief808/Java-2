import java.util.*;
class Demo
{
    public static void main(String[] a)
    {
        ArrayList ob = new ArrayList();
        ob.add(26);
        ob.add("Ramesh");
        ob.add('z');
        ob.add(48);
        ob.add("Zabuilla");
        ob.add(56.78);
        ob.add(false);
        System.out.println(ob);
        System.out.println(ob.get(3));
        System.out.println(ob.contains("Prabhu"));
        ob.remove(4);
        System.out.println(ob);
    }
}
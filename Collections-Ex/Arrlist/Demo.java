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
        ob.add(56.78);
        ob.add(false);
        System.out.println(ob);
        System.out.println(ob.get(3));//gets the element present at specified index
        System.out.println(ob.contains("Prabu"));//checks whether the element is present in ArrayList or not
        ob.remove(4);//removes element at particular index
        System.out.println(ob);
        ob.set(2,68);//sets the mentioned element at mentioned index
        
    }
}
@Deprecated
class A
{
    public void usingDeprecatedMethod()
    {
        System.out.println("Deprecated method in A");
    }
}
class B extends A
{
    @Override
    public void usingDeprecatedMethod()
    {
        System.out.println("Deprecated method in B");
    }
}
class Annot
{
public static void main(String a[]) 
  {
     A obj = new B(); // calling B class using A class Object Reference
     obj.usingDeprecatedMethod();
  }
}

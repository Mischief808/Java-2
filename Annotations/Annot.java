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
    
    public void usingDeprecatedMethod()
    {
        System.out.println("Deprecated method in B");
    }
}
class Annot
{
public static void main(String a[]) 
  {
     A obj = new A();
     obj.usingDeprecatedMethod();
  }
}
class Parent extends Child
{
    public static void main(String a[])
    {
       Child c = new Child();
       c.start();
       c.interrupt();//Interupt Method
       c.interrupt();
       for(int i=1;i<=5;i++)
       {
           System.out.println("Main Thread " +i);
       }
       try
       {
       c.join();//This is Join Method
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
       System.out.println("Thank You");
    }
}

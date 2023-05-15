class Mult4 extends Thread
{
    public void run()
    {
        System.out.println("Multiples of 4");
        for(int i=0;i<40;i=i+4)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                  System.out.println(e);
            }
        }
    }
}
class Mult5 extends Thread 
{
    public void run()
    {
        System.out.println("Multiples of 5");
        for(int i=0;i<40;i=i+5)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class Main extends Thread
{
    public static void main(String args[])
    {
        Mult4 obj = new Mult4();
        Mult5 obj1 = new Mult5();
        obj.start();
        obj1.start();
        System.out.println("End");
    }
}
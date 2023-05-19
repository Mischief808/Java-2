class Child extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            Thread.yield();//yield Method
            System.out.println("Child Thread " +i);
            try
            {
            Thread.sleep(1000);//sleep method
            }
            catch(InterruptedException e)
            {
                System.out.println("Sleep is Interupted");
            }
        }
    }
}
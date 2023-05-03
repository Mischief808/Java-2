class MyOwnException extends Exception
{
    public MyOwnException(String str)
    {
        super(str);
    }
}
class Demo1
{
   public static void main(String a[]) 
    {
        int i=2;
        int j=0;
        try
        {
            j=18/i;
            // j=i/18;
            if(j==0)
            throw new MyOwnException("Don't want to print j as zero");
        }  
        catch(MyOwnException e)
        {
            System.out.println(e);
        } 
        catch(Exception e)
        {
             System.out.println(e);
        }
        System.out.println(j);
    }
}
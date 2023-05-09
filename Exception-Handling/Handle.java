class Handle
{
    public static void main(String d[])
    {
        int num[] = new int[5];
        try 
        {
           System.out.println(num[5]); 
        } 
        catch(Exception e) 
        {
            System.out.println("You are giving excessed Index \n " +e);
        }
        finally 
        {
            System.out.println("End of code");
        }
    }  
}
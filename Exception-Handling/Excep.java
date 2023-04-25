class Excep
{
    public static void main(String d[])
    {
        String str = null;
        try
        {
            str.length();
        }
        catch(Exception e)
        {
            System.out.println("It's wrong" +"\n" +e);
        }
        finally
        {
             System.out.println("Thank you");
        }
    }
}
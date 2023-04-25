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
            System.out.println("Ur giving excessed Index");
        }
    }  
}
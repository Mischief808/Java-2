class Demo
{
    public void checkAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not elgible for applying driving license");
        }
        else 
        {
            System.out.println("You are elgible to apply for Driving License" + "\nYour Age is " +age);
        }
    }
    public static void main(String g[])
    {
        Demo d = new Demo();
        d.checkAge(15);
    }
}
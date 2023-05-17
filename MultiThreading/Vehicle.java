class Vehicle extends Tata
{
  public static void main(String a[]) 
  {
      Tata obj = new Tata();
      Thread t = new Thread(obj);
      t.start();
      for(int i=1;i<6;i++)
      {
      System.out.println("This is vehicle class "+i);
      }  
  }
}
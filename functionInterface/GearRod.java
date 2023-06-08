@FunctionalInterface
interface Gears
{
   void rod();
}
class GearRods
{
    public static void main(String d[])
    {
    //This is Anonymous Inner class
    Gears g = new Gears()
    { 
     public void rod()
      {
         System.out.println("A car has only one Gear Rod");
      }
    };
    g.rod();
   }
}
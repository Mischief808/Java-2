@FunctionalInterface
interface Gear
{
   void rod();
}
class GearRod
{
    public static void main(String d[])
    {
    //This is Anonymous Inner class
    Gear g = new Gear()
    { 
     public void rod()
      {
         System.out.println("A car has only one Gear Rod");
      }
    };
    g.rod();
   }
}
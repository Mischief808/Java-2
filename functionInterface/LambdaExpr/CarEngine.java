@FunctionalInterface
//Method without passing arguments to function

interface Engine
{
   void eng();
}
 
//Method with passing arguments to functions
// interface Engine
//  {
//    void eng(long cc);
//  }
class CarEngine
{
    public static void main(String d[])
    {
        //We can define the method directly using Lambda Expression by reducing code size

        Engine obj = () -> System.out.println("A car has only one engine"); 
        obj.eng();
         
        
        //Lambda Expressions for passing arguments
        
        //  Engine obj = cc -> System.out.println("It is a " + cc + " Engine" );
        //  obj.eng(1498); 
    }
}
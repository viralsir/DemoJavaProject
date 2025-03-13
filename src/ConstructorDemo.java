/*
      constructor : is a special function which is being used to initialize the member variable .
      it does not have any return type
      constructor name and class name must be same .
      it is by default called when the object of the same class has been created.

        polymorphism : one name multiple use
          overloading :
          constructor overloading

 */
class Driver
{
    int id=0;
    String name="vimal";

    // default constructor or no argument constructor .
      Driver()
      {
         id=0;
         name="rajan";
      }
    // parameterise constructor
    Driver(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

}

public class ConstructorDemo
{
    public static void main(String[] args)
    {
            Driver d=new Driver();
            Driver d1=new Driver(2,"Vijay");

        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println(d1.id);
        System.out.println(d1.name);

    }
}

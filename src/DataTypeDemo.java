/*
         category of data type
         1)Primary Data type or built in  Data type
         2)Derived Data type or Secondary Data type
         3)Abstract Data  type


         1)Primary Datatype  or built in Data Type

 keyword                use                         byte                        range
 boolean            true/false                      jvm                         jvm
 byte               numeric value                   1                           -128 to 127  or 0 to 255
 short              numeric value                   1                           0 to 255
 char             character or symbol               2                           -32768 to 32767
 int              numeric value                     4                            huge value
 long           numeric value                       8                           very huge value
 float           decimal value                      8                           very huge value
 double          decimal value                      16                          very very huge value

 String         characters


 variable : is a name of memmory location in which data is being stored.

 naming rules of variable
 1) first character must be alphabet or underscore .
 2) kyeword , symbol and space are not allowed.

 Assignment operator -> =   copy the rightside value into left side.


 */

public class DataTypeDemo
{
    public static void main(String[] args)
    {
        boolean b=true;
        byte y=34;
        char z='q';
        String name="vimal";
        int i;
        long l=3433344l;
        float fl=343434.34f;
        double d=34343444.34;


        i=3444;

        System.out.println("boolean b" + b );
        System.out.println("byte b" + y );
        System.out.println("char b" + z );
        System.out.println("int i" + i );
        System.out.println("long l" + l );
        System.out.println("float fl" + fl );
        System.out.println("double d" + d );
        System.out.println("String name " + name );


    }
}

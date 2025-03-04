import java.util.Scanner;

/*

2) Derived Data type


            Array : is a shared name of multiple memmory blocks which are diff by index.
                                 or
                     is a collection of same data type.

                     dataytpe arrayname[]=new datatype[size];

      int rollno[5]     rollno[0],rollno[1],--- ,rollno[4]   (integer)
      float maths[5];

 */
public class ArrayDemo
{
    public static void main(String[] args)
    {

        int no1=23,no2=45;
        no2=45;
        System.out.println(no1+" "+no2);

        int rollNo[]=new int[5];
        String name[]=new String[5];
        int maths[]=new int[5];
        int science[]=new int[5];

        //int rollNo1=0,maths=0,science=0;
        //String name="";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            //System.out.println("Enter Roll No:");
            //rollNo[i] = sc.nextInt();
            rollNo[i]=i+1;
            System.out.println("Enter Name:");
             name[i] = sc.next();
            System.out.println("Enter Maths:");
            maths[i] = sc.nextInt();
            System.out.println("Enter Science:");
            science[i] = sc.nextInt();
        }
        System.out.println("output :");
        for (int i = 0; i < 3; i++)
        {

            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Science: " + science[i]);

            if(maths[i]>=35 && science[i]>=35)
            {
                System.out.println("You are Pass");
            }
            else {
                System.out.println("You are Fail");
            }


        }


    }

}

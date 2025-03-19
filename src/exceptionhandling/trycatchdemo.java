package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
     Exception : is a message which is being display when runtime error is occured.

     Exception handling

      try
      catch
      finally
      throws
      throw

      interface
      String :
      FMS :
      DB Connectivity :


      class , object  , interface , inheritance , exception handling





 */
public class trycatchdemo
{

    public static void main(String[] args)
    {


        try
        {

            int no1,no2;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no1: ");
            no1=sc.nextInt();
            System.out.println("Enter no2: ");
            no2=sc.nextInt();
            int ans=no1/no2;
            System.out.println("Answer: "+ans);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Zero is not allowed");
        }
//        catch(InputMismatchException e){
//            System.out.println("Character are not allowed");
//        }
        finally
        {
            System.out.println("statement in finally block has been executed.");
        }
        System.out.println("outside catch block");

    }

}

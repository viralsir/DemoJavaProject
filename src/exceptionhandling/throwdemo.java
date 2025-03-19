package exceptionhandling;

/*

     UserDefineException :
 */

import java.util.Scanner;

class MathException extends Exception
{
    String errormsg="";

    MathException(String msg)
    {
        errormsg=msg;
    }
    void displayErrorMsg()
    {
        System.out.println(errormsg);
    }

}


public class throwdemo
{
    public static void main(String[] args) {

        try{

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number : ");
            int num=sc.nextInt();
            if(num<0)
            {
                throw new MathException("Nagetive num is not allowed.");
            }


        }catch (MathException me)
        {
            me.displayErrorMsg();
        }





    }
}

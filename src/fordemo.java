/*
            for(intialization of variable ; condition ; increment/decrement of the variable)
            {
                  statement;
            }

 */

import java.util.Scanner;

public class fordemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Starting value :");
//        int i=sc.nextInt();
//        System.out.println("Enter Ending value :");
//        int j=sc.nextInt();
//        for(;i<=j;)
//        {
//            System.out.println(i);
//            i++;
//        }
//        int sum=0;
//        for(int i=1 ; i<=5 ; sum=sum+i,i++);
//        System.out.println("Sum :"+sum);


        System.out.println("Enter No:");
        int n = sc.nextInt();
//        int divisior_count=0;
//      //  System.out.println("divisor :");
//        for(int i=1;i<=n;i++)
//        {
//            if(n%i==0)
//            {
//                System.out.println(i);
//                divisior_count++;
//            }
//        }
//        if(divisior_count==2)
//        {
//            System.out.println(n+" is a prime number");
//        }
//        else {
//            System.out.println(n+" is not a prime number");
//        }

        boolean isPrime=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true)
        {
            System.out.println(n+ " is a Prime Number");
        }
        else {
            System.out.println(n+ " is not a Prime Number");
        }



    }
}

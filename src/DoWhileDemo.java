/*
           while ,for loop : exit loop

           do while loop : entry loop
                        syntax :
                                    initialization of variable
                                    do
                                    {
                                        true part;
                                        statement;
                                     }while(condition);

                                    initialization of variable
                                    while(condition)
                                    {
                                           true part;
                                           statement;
                                     }



 */

import java.util.Scanner;

public class DoWhileDemo
{
    public static void main(String[] args)
    {

//            int start=11;
//
//            do
//            {
//                System.out.println(start);
//                start++;
//
//            }while(start<=10);

           Scanner input = new Scanner(System.in);
//           System.out.println("Enter a Starting  Number: ");
//           int start = input.nextInt();
//           System.out.println("Enter a Ending  Number: ");
//           int end = input.nextInt();
//
//           do
//           {
//               System.out.println(start);
//               start++;
//
//           }while(start<=end);


//         int start=1;
//         int sum=0;
//         do
//         {
//             System.out.println("enter no:");
//             int no = input.nextInt();
//             sum=sum+no;
//             start++;
//         }while(start<=5);
//
//         System.out.println("sum="+sum);


       // System.out.println("Enter a number: ");
       // int num = input.nextInt();

        int num=1;
       do
       {


          // System.out.println("Divisior :");
           int divisor_count=0;
           int start=1;
           do
           {

               if(num%start==0)
               {
                  // System.out.println(start);
                   divisor_count++;
               }
               start++;

           }while(start<=num);

           if(divisor_count==2)
           {
               System.out.println(num+" is a prime number");
           }





           num++;
       }while(num<=100);







    }

}




























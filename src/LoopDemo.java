import java.util.Scanner;

/*
      1)While Loop
            syntax :
                     intialize the variable
                     while (condition)
                     {
                          true part;
                          statement;
                      }
      2)do While loop
      3)for loop



 */
public class LoopDemo
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter Roll No :");
//        int rollNo = input.nextInt();
//        System.out.println("Enter Name :");
//        String name = input.next();
//        System.out.println("Enter Maths Marks(0-100) :");
//        double marks = input.nextDouble();
//        while(marks<0 || marks>100)
//        {
//            System.out.println("Invalid Marks");
//            System.out.println("Enter Maths Marks(0-100) :");
//            marks = input.nextDouble();
//
//        }
//        System.out.println("Enter Science Marks (0-100):");
//        double scienceMarks = input.nextDouble();
//
//
//        System.out.println("Roll No: "+rollNo);
//        System.out.println("Name: "+name);
//        System.out.println("Marks : "+marks);
//        System.out.println("Science Marks : "+scienceMarks);
//

//        int start=1;
//        while (start<=100)
//        {
//            System.out.println(start);
//            start=start+10;
//        }


//        System.out.println("Enter Starting value :");
//          int start=input.nextInt();
//          System.out.println("Enter ending value :");
//          int end=input.nextInt();
//          while(start<=end)
//          {
//              System.out.println(start);
//              start++;
//          }

//        System.out.println("Enter the Number:");
//        int num = input.nextInt();
//        int start=1;
//        while(start<=10)
//        {
//            System.out.println(num +" * " + start+" = "+num*start);
//            start++;
//        }

//         int start=1;
//         int sum=0;
//         while(start<=10)
//         {
//              sum=sum+start;
//              start++;
//         }
//         System.out.println(sum);

        System.out.println("Enter the Number:");
        int num = input.nextInt();
        System.out.println("Divisor :");
        int start=1;
        while (start<=num)
        {
            if(num%start==0)
            {
                System.out.println(start);
            }
            start++;
        }

























    }
}

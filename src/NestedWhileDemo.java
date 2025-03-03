import java.util.Scanner;

public class NestedWhileDemo
{
    public static void main(String[] args) {

        /*int start=1;
        int nstart;
        while(start<=5)
        {
                nstart=1;
                while (nstart<=3)
                {
                    System.out.print(nstart+" ");
                    nstart=nstart+1;
                }
             System.out.println("");
            start=start+1;

        }*/

       /* int start=1;
        int nstart;
        while(start<=5)
        {
            nstart=1;
            while (nstart<=start)
            {
               // System.out.print(nstart+" ");
                System.out.print("* ");
                nstart=nstart+1;
            }
            System.out.println("");
            start=start+1;

        }
*/


//        int start=1;
//        int nstart;
//        while(start<=5)
//        {
//            nstart=start;
//            while (nstart<=5)
//            {
//                System.out.print(nstart+" ");
//                nstart=nstart+1;
//            }
//            System.out.println("");
//            start=start+1;
//
//        }
  // prime no :  has only 2 divisor (1 no itself)

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number: ");
        //int num = sc.nextInt();
        int num=1;
        int primeno_counter=1;
        while(num<=100)
        {
            int start=1;
            int divisor_count=0;
            while (start<=num)
            {
                if(num%start==0){
                    // System.out.println(start);
                    divisor_count=divisor_count+1;
                }
                start++;
            }
            if(divisor_count==2)
            {
                System.out.println(num);
                primeno_counter=primeno_counter+1;
            }
            num=num+1;

        }
        System.out.println("total prime no:"+primeno_counter);
    }
}
/*
       dry run :
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5


 */
import java.util.Scanner;

public class NestedWhileLoop {

    public static void main(String[] args) {


//        int start=1;
//        while (start<=5)
//        {
//
//            int nstart=start;
//            while (nstart<=5)
//            {
//                System.out.print(nstart +" ");
//                nstart++;
//            }
//            System.out.println("");
//            start++;
//        }
//

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter number: ");
       // int num = sc.nextInt();

        int num=1;
        while(num<=100)
        {

            int start =1;
            int divisor_count=1;
            while(start <= num)
            {
                if(num%start==0)
                {
                    divisor_count++;
                }
                start++;
            }
           // System.out.println(divisor_count);
            if(divisor_count==2)
            {
                System.out.println(num);
            }
          //  System.out.println("num="+num);
         num++;


        }








    }


}
/*
    dry run :
    1
    2
    3
    -------------------------
    1
    2
    3
    --------------------------
    1
    2
    3

 */
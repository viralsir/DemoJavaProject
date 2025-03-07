import java.util.Scanner;

public class functiondemo2
{

    int Divisiour_count(int no)
    {
        int dcount=0;
        for (int i = 1; i <=no; i++)
        {
             if(no%i==0){
                 System.out.print(i+" ");
                  dcount++;
             }
        }
        return dcount;
    }
//    void  isPrime(int dcount)
//    {
//
//        if(dcount==2)
//        {
//            System.out.println("Given no is a Prime");
//        }
//        else {
//            System.out.println("Given no is not a Prime");
//        }
//    }

    void  isPrime(int no1)
    {
        //int dcount=Divisiour_count(no1);
        if(Divisiour_count(no1)==2)
        {
            System.out.println("Given no is a Prime");
        }
        else {
            System.out.println("Given no is not a Prime");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1 = sc.nextInt();

         functiondemo2 obj = new functiondemo2();
         //System.out.println("No of Divisior :"+obj.Divisiour_count(no1));
        //  int dcnt=obj.Divisiour_count(no1);
         // obj.isPrime(dcnt);

       // obj.isPrime(obj.Divisiour_count(no1));

        obj.isPrime(no1);
    }
}

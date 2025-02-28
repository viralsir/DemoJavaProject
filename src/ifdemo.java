import java.util.Scanner;

/*
     conditional control structure

     1)if
            1)if else
            2)else if
            3)nested if

            syntax :
                    if(condition)
                    {
                            true part;
                            statement;
                    }
                    else
                    {
                        false part;
                        statement;
                    }


     2)Switch

     Relational Operator
     Opreator                  symbol
     Grater than                >
     Less than                  <
     equal to                   ==
     not equal to               !=
     grater than or
     equal to                   >=
     less than or
     equal to                   <=

     Logical Operator
     Operator               symbol
     and                        &&
     or                         ||
     not                        !


 */
public class ifdemo
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter No1:");
         int no1 = sc.nextInt();
         System.out.println("Enter No2:");
         int no2 = sc.nextInt();
         System.out.println("Enter No3:");
         int no3 = sc.nextInt();

         if(no1>0 && no2>0 && no3>0)
         {

             if(no1>no2 && no1>no3)
             {
                 System.out.println("No1 is a Maximum no");
             }
             else if(no2>no1 && no2>no3) {
                 System.out.println("No2 is a Maximum no");
             }
             else{
                 System.out.println("No3 is a Maximum no");
             }

         }
         else
         {
             System.out.println("Nagetive input are not valid");
         }




    }
}

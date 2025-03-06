import java.util.Scanner;

/*

std-1 A,B,C,D

std-10 : A,B,C,D


      int rollno[]=new int[200];
      String name[]=new String[200];
      int maths[]=new int[200];
      
      
      int rollno[][]=new int[4][50]
      
      int rollno[][][]=new int[10][4][50]
      
      rollno[0][0][10]
      
      
      int student=new int[10][4][50][4]     {rollno,maths,scien,english}


 */
public class TwoDiArrayDemo2 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

            int rollno[][]=new int[4][50];
            String name[][]=new String[4][50];
            int maths[][]=new int[4][50];
            int science[][]=new int[4][50];
            int english[][]=new int[4][50];


            int divindex[]={0,0,0,0};
            int option=0;
            do
            {

                System.out.println("press 1 for Entry ");
                System.out.println("press 2 for View");
                System.out.println("press 3 for Exit");

                System.out.println("Enter Your option :");
                option=sc.nextInt();

                switch(option)
                {
                    case 1:

                        for (int index=0;index<3;index++)
                        {


                            System.out.println("Press 0 for Division A ");
                            System.out.println("Press 1 for Division B ");
                            System.out.println("Press 2 for Division C ");
                            System.out.println("Press 3 for Division D ");

                            System.out.println("Enter your div :");
                            int div = sc.nextInt();

                            System.out.println("Enter rollno : ");
                            rollno[div][divindex[div]] = sc.nextInt();    // rollno[0][0] ,  rollno[1][1]
                            System.out.println("Enter name : ");
                            name[div][divindex[div]] = sc.next();
                            System.out.println("Enter maths : ");
                            maths[div][divindex[div]] = sc.nextInt();
                            System.out.println("Enter science : ");
                            science[div][divindex[div]] = sc.nextInt();
                            System.out.println("Enter english : ");
                            english[div][divindex[div]] = sc.nextInt();

                            divindex[div]++;

                        }

                    break;
                    case 2:
                        System.out.println("output :\n");

                        System.out.println("Press 0 for Division A ");
                        System.out.println("Press 1 for Division B ");
                        System.out.println("Press 2 for Division C ");
                        System.out.println("Press 3 for Division D ");

                        System.out.println("Enter your div :");
                        int div = sc.nextInt();


                        for (int index = 0; index < divindex[div]; index++)
                        {
                            System.out.println("rollno : "+rollno[div][index]);
                            System.out.println("name : "+name[div][index]);
                            System.out.println("maths : "+maths[div][index]);
                            System.out.println("science : "+science[div][index]);
                            System.out.println("english : "+english[div][index]);
                            System.out.println("-----------------------------------");
                        }
                    break;
                    case 3:
                        System.out.println("you are exited");
                    break;
                    default:
                        System.out.println("Wrong option selected try again !");
                    break;

                }





            }while(option!=3);









    }
}

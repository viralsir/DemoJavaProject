import java.util.Scanner;

class student
{
    // member variable
    int rollno;
    String name;
    int maths;
    int science;
    int english;


    // member function
    void entry()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Roll No:");
        rollno= sc.nextInt();
        System.out.println("Enter Name :");
        name=sc.next();
        System.out.println("Enter Maths :");
        maths=sc.nextInt();
        System.out.println("Enter Science:");
        science=sc.nextInt();
        System.out.println("Enter English :");
        english=sc.nextInt();


    }

    void view()
    {
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);

    }


}


public class OOPDemo
{
    public static void main(String[] args) {

//       student s1=new student();
//       student s2=new student();
//       student s3=s1;
//       s1.rollno=10;
//       s1=s2;
//       s2.rollno=20;
//        System.out.println(s3.rollno);


//        student s1=new student();
//        student s2=new student();
//
//
//
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter Roll No:");
//        s1.rollno= sc.nextInt();
//        System.out.println("Enter Name :");
//        s1.name=sc.next();
//        System.out.println("Enter Maths :");
//        s1.maths=sc.nextInt();
//        System.out.println("Enter Science:");
//        s1.science=sc.nextInt();
//        System.out.println("Enter English :");
//        s1.english=sc.nextInt();
//
//
//        System.out.println("Enter Roll No:");
//        s2.rollno= sc.nextInt();
//        System.out.println("Enter Name :");
//        s2.name=sc.next();
//        System.out.println("Enter Maths :");
//        s2.maths=sc.nextInt();
//        System.out.println("Enter Science:");
//        s2.science=sc.nextInt();
//        System.out.println("Enter English :");
//        s2.english=sc.nextInt();
//

//
//
//        System.out.println("output :\n");
//
//        System.out.println("Roll No:"+s1.rollno);
//        System.out.println("Name :"+s1.name);
//        System.out.println("Maths :"+s1.maths);
//        System.out.println("Science :"+s1.science);
//        System.out.println("English :"+s1.english);
//
//        System.out.println("Roll No:"+s2.rollno);
//        System.out.println("Name :"+s2.name);
//        System.out.println("Maths :"+s2.maths);
//        System.out.println("Science :"+s2.science);
//        System.out.println("English :"+s2.english);


//        student s1[]=new student[5];
//        Scanner sc=new Scanner(System.in);
//
//        for(int i=0;i<3;i++)
//        {
//
//            s1[i]=new student();
//            System.out.println("Enter Roll No:");
//            s1[i].rollno= sc.nextInt();
//            System.out.println("Enter Name :");
//            s1[i].name=sc.next();
//            System.out.println("Enter Maths :");
//            s1[i].maths=sc.nextInt();
//            System.out.println("Enter Science:");
//            s1[i].science=sc.nextInt();
//            System.out.println("Enter English :");
//            s1[i].english=sc.nextInt();
//
//
//        }
//
//        System.out.println(" output :\n");
//        for (int i = 0; i < 3; i++)
//        {
//            System.out.println("Roll No:"+s1[i].rollno);
//            System.out.println("Name :"+s1[i].name);
//            System.out.println("Maths :"+s1[i].maths);
//            System.out.println("Science :"+s1[i].science);
//            System.out.println("English :"+s1[i].english);
//
//        }


        student s1[]=new student[5];

        for(int i=0;i<3;i++)
        {

            s1[i]=new student();
            s1[i].entry();

        }

        System.out.println(" output :\n");
        for (int i = 0; i < 3; i++)
        {
            s1[i].view();

        }

    }
}



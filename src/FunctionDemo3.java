import java.util.Scanner;

public class FunctionDemo3
{

    static int  checkmarks(int marks,String subject)
    {
        Scanner sc = new Scanner(System.in);
        while(marks<0 || marks>100)
        {
            System.out.println("invalid "+subject +" Marks");
            System.out.println("Enter "+subject +" Marks");
            marks=sc.nextInt();
        }

       return marks;
    }

    static void  checkFail(int marks,String subject,int Passing_marks)
    {

           if(marks<Passing_marks)
           {
               System.out.println("You are Fail in "+subject);
           }
    }


    static void pass_fail(int maths,int science,int english)
    {
       final  int Passing_marks=35;


        if(maths>=Passing_marks && science>=Passing_marks && english>=Passing_marks)
        {
            int total=maths+science+english;
            float avg=total/3.0f;
            System.out.println("You are Pass");
            System.out.println("Total Marks: "+total);
            System.out.println("Avg Marks: "+avg);
            Grade(avg);
        }
        else
        {
            checkFail(maths,"Maths",Passing_marks);
            checkFail(science,"Science",Passing_marks);
            checkFail(english,"English",Passing_marks);

           //System.out.println("You are Fail");
        }
    }


    static void Grade(float avg)
    {
           if(avg>=90) {
               System.out.println("Grade : A");
           }
           else if(avg>=70) {
               System.out.println("Grade : B");
           }
           else if(avg>=55) {
               System.out.println("Grade : C");
           }
           else {
               System.out.println("Grade : D");
           }
    }



    public static void main(String[] args)
    {

        int rollno,maths,science,english;
        String name;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter rollno:");
        rollno = input.nextInt();
        System.out.println("Enter name:");
        name = input.next();
        System.out.println("Enter maths:");
        maths = FunctionDemo3.checkmarks(input.nextInt(),"Maths");
        //maths=FunctionDemo3.checkmarks(maths,"Maths");
        System.out.println("Enter science:");
        science = FunctionDemo3.checkmarks(input.nextInt(),"Science");

        System.out.println("Enter english:");
        english = FunctionDemo3.checkmarks(input.nextInt(),"English");


        System.out.println("Roll no:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Maths:"+maths);
        System.out.println("Science:"+science);
        System.out.println("English:"+english);
        pass_fail(maths,science,english);





    }
}

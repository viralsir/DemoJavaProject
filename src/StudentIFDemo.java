import java.util.Scanner;

public class StudentIFDemo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter Maths Marks :");
        int maths = sc.nextInt();
        System.out.println("Enter English Marks :");
        int english = sc.nextInt();
        System.out.println("Enter Science Marks :");
        int science = sc.nextInt();

        if(maths>=35 && english>=35 && science>=35)
        {

            System.out.println("You are Pass");
            int total = maths+english+science;
            float avg = total / 3;

            System.out.println("The average marks is "+avg);
            System.out.println("The total marks is "+total);
              if(avg>=90)
              {
                  System.out.println("Grade : A");
              }
              else if(avg>=80){
                  System.out.println("Grade : B");
              }
              else if(avg>=60){
                  System.out.println("Grade : C");
              }
              else{
                  System.out.println("Grade : D");
              }
        }
        else{
            System.out.println("You are Fail");
        }



    }
}

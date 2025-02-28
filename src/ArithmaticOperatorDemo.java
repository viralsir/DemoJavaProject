import java.util.Scanner;

/*
    Arithamatic Operator

    Opreator        Symbol
    Addition        +
    Substraction    -
    Division        /
    Multiplication     *
    module           % remainder


 */
public class ArithmaticOperatorDemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        //int no1 = sc.nextInt();
        float no1=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float no2 = sc.nextFloat();

        float total = no1 + no2;
//        System.out.println("total :"+ (no1+no2) );
        System.out.println("total :"+ total );
        System.out.println("Subtraction :"+(no2-no1));
        System.out.println("Multiplication :"+(no1*no2));
        System.out.println("Division :"+(no1/no2));
        System.out.println("Remainder :"+(no1%no2));





    }
}

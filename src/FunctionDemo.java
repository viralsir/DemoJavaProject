/*
     function is a part of the class

     member function

     function :- is a sub program which help the main program to get the output.

     function will accept argument/parameter and return the value.

     category of function
     1) function with argument and with return value
     2) function with argument and without return value
     3) function without argument and with return value
     4) function without argument and without return value.

    syntax :-
                1)function defination   one time
                return type  functionname(Parameter1,parameter2,----,ParameterN)
                {
                         statement;
                         return value;
                 }
                   return type :
                                    int : function should return integer value
                                    char or String : function should return character
                                    float : function should return floating value
                                    double : function should return real value
                                    void : function should not return any value .


                2) function calling : multiple time
                            variable =  functionname(value1,value2,-----,valueN)




     member function : you should create object to call the function.


 */


import java.util.Scanner;

public class FunctionDemo
{
     // member variable
      int i,j;

    //1) function with argument and with return value.
//    int total(int no1,int no2)
//    {
//        return no1+no2;
//    }

    //2) function with argument and without return value
//    void total(int no1,int no2)
//    {
//        int sum=no1+no2;
//        System.out.println(sum);
//    }


    // 3) function with return value and without argument
//    int  total()
//    {
//        return i+j;
//    }

    // function without return value and without argument
    void total()
    {
        System.out.println("total :"+ (i+j));
    }



    public static void main(String[] args)
    {
        //local variable

        FunctionDemo fobj = new FunctionDemo();

//        int sum=fobj.total(12,33);
//        System.out.println(sum);
//        System.out.println(fobj.total(42,33));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1: ");
        fobj.i = sc.nextInt();
        System.out.println("Enter no2: ");
        fobj.j = sc.nextInt();
//
//        System.out.println(fobj.total(j,i));

//          fobj.total(10,20);
//          fobj.total(i,j);

        //System.out.println(fobj.total());
        fobj.total();






    }





}


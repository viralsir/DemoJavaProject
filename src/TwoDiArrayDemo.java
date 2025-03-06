/*
    Multidimenstional Array :

    Two di array : Array of Array (each element of an array is itself an array. )
 */

import java.util.Scanner;

public class TwoDiArrayDemo
{
    public static void main(String[] args) {

//        int no[][]={ {23},{33,44},{56,77}};
//
//        int rollno[][]=new int[2][3];
//        int rollno[][]={ {1,2,3},{4,5,6} }
//
//        System.out.println(no[2][1]);

         int no[][]=new int[3][3];

         Scanner sc=new Scanner(System.in);
        System.out.println("Enter value :");
        no[0][0]=sc.nextInt();
        System.out.println("Enter value :");
        no[0][1]=sc.nextInt();
        System.out.println("Enter value :");
        no[0][2]=sc.nextInt();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Enter value :");
                no[i][j]=sc.nextInt();

            }


        }

        System.out.println("output :\n");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) {
                System.out.print(no[i][j]+" ");
            }
            System.out.println("");
        }





    }

}

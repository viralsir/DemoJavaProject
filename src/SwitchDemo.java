/*
    Switch
          check equal condition multiple times

        syntax :
                  switch(variable)
                  {
                           case value :
                                        true part;
                                        statement;
                             break;
                             case value :
                                         true part;
                                         statement;
                                         break;
                               ----------------
                               ----------------
                               default :
                                        true part;
                                        statement;
                               break;
                               }
 */

import java.util.Scanner;

public class SwitchDemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No1:");
        int no1 = sc.nextInt();
        System.out.println("Enter No2:");
        int no2 = sc.nextInt();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Exit");

        System.out.println("Enter Your option :");
        int option = sc.nextInt();

        switch(option)
        {
            case 1:
                   int ans = no1 + no2;
                   System.out.println(ans);
                   break;
           case 2:
               int ans2 = no1 - no2;
               System.out.println(ans2);
          break;
          case 3:
              int ans3 = no1 * no2;
              System.out.println(ans3);
              break;
          case 4:
              int ans4 = no1 / no2;
              System.out.println(ans4);
              break;
          case 5:
              System.out.println("You are Exited");
              break;
          default:
              System.out.println("Invalid Option");
              break;
        }



    }
}

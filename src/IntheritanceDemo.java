/*
          Inheritance : is the proccess by which object of one class can access or get the properties of object of another class.
          class A
          {
                   int noA;
          }
          class B (sub class/child class / derived class) extends A (super class / base class / parent class)
          {
             int noB;
           }

            A a1=new A();
            a1.noA;


            B b1=new B();
            b1.noB;
            b1.noA;

            category of inheritance


            1) Single Inheritance : one class or object can access or get the properties of only one object at a time.
                        A
                        |
                        B

         2)  Multilevel Inheritance : Continous chain of single intheritance

                        A
                        |
                        B
                        |
                        C
                        |
                        D
        3) Hyrarchical Ineritance : more than one object can access or get the properties of same object.

                           A
                    |               |
                    B               C


        4) multiple Inheritance :  one object can access the properties of more than one object at a time.

                          A               B
                                 |
                                 C    not supported in java.


        5) Hybrid Inheritance : combination of more than one inheritance

                            Personal_info
                                |
                   Employee                 Customer
                        |
                     Dmart




 */

import java.util.Scanner;

class Personal_info
{
     int id;
     String name;
     String phoneNumber;
     String address;

     void setPersonal_info()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter ID");
         id = sc.nextInt();
         System.out.println("Enter Name");
         name = sc.next();
         System.out.println("Enter Phone Number");
         phoneNumber = sc.next();
         System.out.println("Enter Address");
         address = sc.next();
     }

     void getPersonal_info()
     {
         System.out.println("ID :"+id);
         System.out.println("Name :"+name);
         System.out.println("Phone Number :"+phoneNumber);
         System.out.println("Address :"+address);
     }


}

class Employee extends Personal_info
{
    int salary;

    void setSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        salary = sc.nextInt();
    }
    void getSalary()
    {
        System.out.println("Salary :"+salary);
    }

}
class Customer extends Personal_info
{
       int billamount;

       void setBillamount()
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Bill Amount");
           billamount = sc.nextInt();
       }
       void getBillamount()
       {
           System.out.println("Bill Amount :"+billamount);
       }

}


class Dmart extends Employee
{
    String location;

    void setLocation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Location");
        location = sc.next();
    }
    void getLocation()
    {
        System.out.println("Location :"+location);
    }

}


public class IntheritanceDemo
{
    public static void main(String[] args)
    {

//        Employee e = new Employee();
//        e.setPersonal_info();
//        e.setSalary();
//
//        e.getPersonal_info();
//        e.getSalary();

//           Dmart d = new Dmart();
//
//           d.setLocation();
//           d.setPersonal_info();
//           d.setSalary();
//
//
//           d.getLocation();
//           d.getPersonal_info();
//           d.getSalary();


              Employee emp = new Employee();
              Customer cust = new Customer();

        System.out.println("Employee Information");
        emp.setPersonal_info();
        emp.setSalary();


        System.out.println("Customer Information");
        cust.setPersonal_info();
        cust.setBillamount();


        System.out.println("Employee Information");
        emp.getPersonal_info();
        emp.getSalary();


        System.out.println("Customer Information");
        cust.getPersonal_info();
        cust.getBillamount();








    }
}

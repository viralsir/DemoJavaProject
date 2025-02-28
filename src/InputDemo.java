import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Number  : ");
        int no=sc.nextInt();
        System.out.println("Enter Name : ");
        String name=sc.next();

        System.out.println("Number :"+no);
        System.out.println("Name :"+name);


    }

}

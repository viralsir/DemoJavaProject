package exceptionhandling;
/*

 throws : is being used to ignore the checked (compiletime) exption

 */
import java.io.DataInputStream;
import java.io.IOException;

public class ThrowsDemo
{
    public static void main(String[] args) throws IOException
    {
            DataInputStream in = new DataInputStream(System.in);

            System.out.println("Enter Name: ");
            String name = in.readLine();

            System.out.println("Name : " + name);

    }

}

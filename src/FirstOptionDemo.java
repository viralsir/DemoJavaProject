public class FirstOptionDemo
{
    private int  p=23;
    protected int pr=34;
    int d=34;
    public int pu=3434;


    public static void main(String[] args)
    {
            FirstOptionDemo f=new FirstOptionDemo();

        System.out.println("private int p :"+f.p);
        System.out.println("protected int pr :"+f.pr);
        System.out.println("default int d :"+f.d);
        System.out.println("public int pu :"+f.pu);


    }



}

class SecondOptionDemo //extends FirstOptionDemo
{
    public static void main(String[] args)
    {
        //SecondOptionDemo f=new SecondOptionDemo();
        FirstOptionDemo f=new FirstOptionDemo();

       // System.out.println("private int p :"+f.p);
        System.out.println("protected int pr :"+f.pr);
        System.out.println("default int d :"+f.d);
        System.out.println("public int pu :"+f.pu);

    }


}

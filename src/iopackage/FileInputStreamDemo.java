package iopackage;

import java.io.FileInputStream;
class FileInputStreamDemo
{
	public static void main(String args[])throws Exception
	{
		FileInputStream ff = new FileInputStream("D:\\Student\\Dhaval\\DemoJavaProject\\src\\iopackage\\ByteArrayInputStreamDemo.java");
		int c;
		while((c=ff.read())!=-1)
		{
			System.out.print((char)c);
		}	
		ff.close();
	}
}
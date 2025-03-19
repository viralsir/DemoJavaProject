package iopackage;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
class SequenceInputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		//  File f=new File("FileInputStreamDemo.java");
		FileInputStream fin1 = new FileInputStream("D:\\Student\\sahil\\Java\\BasicJavaProject\\src\\iopackage\\FileInputStreamDemo.java");
		FileInputStream fin2 = new FileInputStream("D:\\Student\\sahil\\Java\\BasicJavaProject\\src\\iopackage\\FileOutputStreamDemo.java");
		SequenceInputStream seq = new SequenceInputStream(fin1,fin2);
		int c;
		while((c=seq.read())!=-1)
		{
			
			System.out.print((char)c);
		}
	}
}
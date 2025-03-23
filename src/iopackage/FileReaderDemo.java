package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
class FileReaderDemo
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr = new FileReader("D:\\Student\\Dhaval\\DemoJavaProject\\src\\iopackage\\FileReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		while((s=br.readLine())!= null)
		{
			System.out.println(s);
		}	
	}
}
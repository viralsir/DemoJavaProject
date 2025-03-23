package iopackage;
/*

ARMY
SCIENCTIEST

DATA STOREAGE

PC : PERSONAL COMPUTER  (STEVE JOBS)

FILE :  IOPACKAGE


	FMS : - FILE MANAGMENT SYSTEM
			DATA : STRUCTURE :  : NOT
			       UNSTRUCTURE  : FILE

			1) SEQUEANCE :
							ROLLNO		NAME		MATHS		SCIENCE ENGLISH	 PHYSICS  PASS/FAIL GRADE


			2) DELETIONS :

	DATABASE :  TABULAR FORMAT   TABLE (ROW * COL)

			SQL  /  SEQUEAL    (IBM)

	DBMS : DATABASE MANAGEMENT SYSTEM

						ORACLE ,POSTGRES,MYSQL ,SQLSERVER,DB2,--------

	RDBMS  (sql) / NOSQL
     KEY:VALUE {}
	JDK 1.3

	jdk 1.10

		STREAM :- DATA -> BYTE 
	
			OUTPUTSTREAM :- TO WRITE / STORE DATA INTO FILE
			INPUTSTREAM :- TO READ FROM FILE 
		
		
		
*/

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
class ByteArrayOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String temp="this is firstdemo by DHAVAL";
		byte b[] = temp.getBytes();
		bout.write(b);
		System.out.println("String is : " + bout.toString());
		
		FileOutputStream fout = new FileOutputStream("first.txt");
		bout.writeTo(fout);
	}
}
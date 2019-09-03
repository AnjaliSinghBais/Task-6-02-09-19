package com.ssi.FileTask;
import java.io.*;

public class Merge {

	public static void main(String[] args) throws IOException {
	 FileInputStream fistream1 = new FileInputStream("H:/f1.txt"); 
	   FileInputStream fistream2 = new FileInputStream("H:/f2.txt"); 

	   SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);  
	   FileOutputStream fostream = new FileOutputStream("H:/Merge.txt");   

	   int temp;
	   System.out.println("Now file content is:");
	   while( ( temp = sistream.read() ) != -1)
	   {
	     System.out.print( (char) temp );
	     fostream.write(temp);
	   }
	   fostream.close();
	   sistream.close();
	   fistream1.close();
	   fistream2.close();
	  }

	}



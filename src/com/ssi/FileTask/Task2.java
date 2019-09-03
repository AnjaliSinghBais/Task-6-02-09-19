package com.ssi.FileTask;
import java.io.*; 
public class Task2 {
	
	//program to copy content of one file to another file 
	
	     public static void main(String args[])throws IOException 
	       { 
	             FileInputStream Fread =new FileInputStream("E:/C/file1.txt"); 
	             FileOutputStream Fwrite=new FileOutputStream("E:/C/file2.txt") ; 
	             System.out.println("File is Copied"); 
	             int c; 
	             while((c=Fread.read())!=-1) 
	             Fwrite.write((char)c); 
	             Fread.close(); 
	             Fwrite.close(); 
	        } 
	} 



package com.ssi.FileTask;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	public class Delete {
	public static void main(String args[]) throws Exception {
	File f=new File("H:\\aBC.txt");
	BufferedReader bt = new BufferedReader(new FileReader(f));
	String st;
	while((st=bt.readLine())!=null){
	System.out.println(st);

	       
	}
	bt.close();
	Path path 
	    = Paths.get("H:\\aBC.txt"); 

	if(Files.deleteIfExists(path)){
	System.out.println("file deleted");
	}
	}
	}




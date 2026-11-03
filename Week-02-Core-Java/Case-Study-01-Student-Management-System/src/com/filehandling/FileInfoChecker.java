package com.filehandling;

import java.io.File;
import java.util.Date;

public class FileInfoChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File obj=new File("sample.txt");

         if(obj.exists())
         {
        	 System.out.println("file exists");
        	 if(obj.isFile()){
        		 System.out.println("it is a file");
        	 }
        	 else if(obj.isDirectory())
        	 {
        		 System.out.println("it is directory");
        	 }
        	    
        	 obj.setReadOnly();
             System.out.println("can read:"+obj.canRead());
             System.out.println("can write:"+obj.canWrite());
             
            
             System.out.println("Filename:"+obj.getName());
             System.out.println("CompletePath:"+obj.getAbsolutePath());
             System.out.println("Filepath:"+obj.getPath());
             System.out.println("Parent:"+obj.getParent());
             
             
             System.out.println("File Size:"+obj.length());
             
             
            long time = obj.lastModified();
             Date d=new Date(time);
            System.out.println("last modified:"+d);
            
            
     
            
            
            
     }
         
     else
         System.out.println("File Doesnot exists");
     
        
  }
}

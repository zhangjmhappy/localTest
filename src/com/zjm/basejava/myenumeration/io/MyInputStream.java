package com.zjm.basejava.myenumeration.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class MyInputStream {
	public static void main(String[] args) throws IOException {
//		myUseBuffer();
//		ArrayList
		
		myStringBufferInputStream();
	}
	
	public static void myStringBufferInputStream() throws IOException{
		StringBufferInputStream in = new StringBufferInputStream("jack");
		int data ;
		while((data = in.read()) != -1 ){
			System.out.print(data + " ");
		}
		in.close();

	}
	
	   public static void myUseBuffer() throws IOException {
	        final int size = 1024;
	        FileInputStream in  = new FileInputStream("E:\\test.txt");
	        FileOutputStream out  = new FileOutputStream("E:\\copy_test.txt");
	        //创建字节数组缓存组
	        byte[] buff= new byte[size];

	        
	        //把test.txt文件的数据读入到buff中
	        int len = in.read(buff);
	        if(in.markSupported()){
	        	
	        }
	        System.out.println(len);
	        while(len != -1){
	            out.write(buff,0,len);	//把buff中的数据写入到copy_test.txt中
	            len = in.read(buff);	
	            System.out.println("while:"+ len);
	        }

	        in.close();
	        out.close();

	    }

	    public static void myFileInputStreanDemo() throws IOException {
	        FileInputStream fin = new FileInputStream("E:\\test.txt");
	        int data ;
	        while ((data = fin.read()) != -1){
	            System.out.print(data + " ");

	        }
	        fin.close();
	    }

	    public static void byteArrayInputStreamDemo() throws IOException {
	        byte[] buff = new byte[]{2,15,67,-1,-9,9};
	        ByteArrayInputStream in = new ByteArrayInputStream(buff,0,buff.length);
	        int data = in.read();
	        while(data != -1){
	            System.out.print(data + " ");
	            data = in.read();
	        }

	        in.close();
	    }

}

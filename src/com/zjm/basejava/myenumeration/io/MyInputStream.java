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
	        //�����ֽ����黺����
	        byte[] buff= new byte[size];

	        
	        //��test.txt�ļ������ݶ��뵽buff��
	        int len = in.read(buff);
	        if(in.markSupported()){
	        	
	        }
	        System.out.println(len);
	        while(len != -1){
	            out.write(buff,0,len);	//��buff�е�����д�뵽copy_test.txt��
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

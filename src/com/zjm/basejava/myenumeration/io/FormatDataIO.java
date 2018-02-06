package com.zjm.basejava.myenumeration.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FormatDataIO {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("E:\\test01.txt");
		BufferedOutputStream out1 = new BufferedOutputStream(out);
		DataOutputStream out2 = new DataOutputStream(out1);

		out2.writeByte(-12);
		out2.writeLong(12);
		out2.writeChar('1');
		out2.writeUTF("บร");
		out2.close();
		
		FileInputStream in = new FileInputStream("E:\\test01.txt");
		BufferedInputStream in1 = new BufferedInputStream(in);
		DataInputStream in2 = new DataInputStream(in1);
		
		System.out.print(in2.readByte() + " ");
		System.out.print(in2.readLong() + " ");
		System.out.print(in2.readChar() + " ");
		System.out.print(in2.readUTF() + " ");

	}
}
